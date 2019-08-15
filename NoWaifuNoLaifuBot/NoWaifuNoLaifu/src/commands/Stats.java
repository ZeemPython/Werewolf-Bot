package commands;

import main.Prefix;
import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class Stats extends ListenerAdapter implements Prefix {

	public void onGuildMessageReceived(GuildMessageReceivedEvent e) {

		String[] args = e.getMessage().getContentRaw().split("\\s+");
		
		EmbedBuilder stats = new EmbedBuilder();
		
		if (args[0].equalsIgnoreCase(prefix + "stats")) {
			
			stats.setColor(colorID.hashCode());
		
			stats.setFooter("Stats for: " + e.getAuthor().getName(), e.getMember().getUser().getAvatarUrl());
			
			if (e.getAuthor().getAsTag().equals("Evozims#1001")) {
				
				stats.setDescription("Waifus Obtained: \n\n"
						+ "* Inori-DarkQueen lvl 300\n "
						+ "* Megumin-Snow lvl 22\n "
						+ "* Asuna-ULTRA lvl 33");
			} else 
				stats.setDescription("No Stats to Display");
		
		
			
			
			e.getChannel().sendTyping().queue();
			e.getChannel().sendMessage(stats.build()).queue();
			
			stats.clear();
			
			
			return;
			
		}
	
	}

}
