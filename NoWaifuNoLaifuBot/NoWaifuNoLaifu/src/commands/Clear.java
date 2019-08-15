package commands;

import java.util.List;

import main.Prefix;
import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;


public class Clear extends ListenerAdapter implements Prefix {
	
	public void onGuildMessageReceived(GuildMessageReceivedEvent e) {
		
		String[] args = e.getMessage().getContentRaw().split("\\s+");
		
		if (args[0].equalsIgnoreCase(prefix + "clear")) {
			
			if (args.length < 2) {
				
				// Usage
				EmbedBuilder usage = new EmbedBuilder();
				usage.setColor(colorID.hashCode());
				usage.setTitle("Please specify amount to delete!");
				usage.setDescription("Usage: `" + prefix + "clear [# of messages]`");
				e.getChannel().sendMessage(usage.build()).queue();
				usage.clear();
			}
			
			else {
				
				try {
					List<Message> messages = e.getChannel().getHistory().retrievePast(Integer.parseInt(args[1])).complete();
					e.getChannel().deleteMessages(messages).queue();
					
					// Success
					EmbedBuilder success = new EmbedBuilder();
					success.setColor(colorID.hashCode());
					success.setTitle("✅ Successfully deleted " + args[1] + " messages.");
					
					e.getChannel().sendMessage(success.build()).queue();
					success.clear();
					
				}
				
				catch (IllegalArgumentException err) {
					
					if (err.toString().startsWith("java.lang.IllegalArgumentException: Message retrieval") || args[1].equals("1")) {
					
						// Too many messages
						EmbedBuilder error = new EmbedBuilder();
						error.setColor(colorID.hashCode());
						error.setTitle("🔴 Error");
						error.setDescription("Between 1-101 messages can be deleted at one time. No more, no less!");
			
						e.getChannel().sendMessage(error.build()).queue();
						error.clear();
				
					}
					
					else {
						
						// Messages too old
						EmbedBuilder error = new EmbedBuilder();
						error.setColor(colorID.hashCode());
						error.setTitle("🔴 Selected messages are older than 2 weeks");
						error.setDescription("Messages older than 2 weeks cannot be deleted.");
						
						e.getChannel().sendMessage(error.build()).queue();
					}
					
					
				}
			}
		}
	
	return;
	
	}

}
