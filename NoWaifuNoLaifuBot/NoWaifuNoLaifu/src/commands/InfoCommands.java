package commands; 

import main.Prefix;
import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class InfoCommands extends ListenerAdapter implements Prefix {
	
	public void onGuildMessageReceived(GuildMessageReceivedEvent e) {
		
		String[] args = e.getMessage().getContentRaw().split("\\s+");
		
		EmbedBuilder embed = new EmbedBuilder();
		
		if (args[0].equalsIgnoreCase(prefix + "botinfo")) {
			
			embed.setColor(colorID.hashCode());
			
			embed.setTitle("Information: ");
			embed.setDescription("Welcome to Werewolf. This is an alternative version of the famous Mafia game.\nPlease use `!howtoplay` for help.");
			embed.setFooter("Creator: EvoZims", e.getJDA().getUserById("117841096767176712").getAvatarUrl());
			
			e.getChannel().sendTyping().queue();
			e.getChannel().sendMessage(embed.build()).queue();
			embed.clear();
			
		}

		if (args[0].equalsIgnoreCase(prefix + "help")) {
			
			embed.setColor(colorID.hashCode());
			
			embed.setTitle("Help is needed!!");
			embed.setDescription("**__General Commands__** \n" +
								 "`" + prefix + "botinfo` - Displays information about me.\n" +
			                     "`" + prefix + "help` - Displays this window.\n" +
			                     "`" + prefix + "ping` - Ping me! \n\n" + 
			                     
			                     "**__Utility Commands__** \n" + 
								 "`" + prefix + "clear` - Clears between 1-100 messages that are not over 2 weeks old.\n"
								 );		
			
			e.getChannel().sendTyping().queue();
			e.getChannel().sendMessage(embed.build()).queue();
			embed.clear();
			
		}
		
		if (args[0].equalsIgnoreCase(prefix + "ping")) {
			
			embed.setColor(colorID.hashCode());
			embed.setTitle("Pong!!");
			embed.setDescription("~~xx : ms.~~");
			
			e.getChannel().sendTyping().queue();
			e.getChannel().sendMessage(embed.build()).queue();
			embed.clear();
			
		}
		
		return;
	} 

}

//info.setTitle("�?�  WaifuNoLaifuBot �?�");
