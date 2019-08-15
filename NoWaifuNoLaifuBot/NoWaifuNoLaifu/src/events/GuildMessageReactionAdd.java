package events;

import main.Prefix;
import net.dv8tion.jda.core.events.message.guild.react.GuildMessageReactionAddEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class GuildMessageReactionAdd extends ListenerAdapter {
	
	public void onGuildMessageReactionAdd(GuildMessageReactionAddEvent e) {
		
		if (e.getReactionEmote().getName().equals("❌") && 
				!e.getMember().getUser().equals(e.getJDA().getSelfUser())) { 
			
			if (e.getMember().getUser().equals(e.getChannel().getMessageById
				(e.getMessageId()).complete().getAuthor())) {
				//If author
					e.getChannel().getMessageById(e.getMessageId()).complete().delete().queue();
			} else {
				//If not author
				e.getReaction().removeReaction().queue();
				
				
			}
			
			
		}	
	}
}
