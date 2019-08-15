package events;

import main.Prefix;
import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class GuildMessageReceived extends ListenerAdapter implements Prefix {
	
	public void onGuildMessageReceived(GuildMessageReceivedEvent e) {
		e.getMessage().addReaction("❌").queue();
		
	}

}
