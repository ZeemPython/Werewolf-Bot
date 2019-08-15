package events;

import java.util.Random;

import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.events.guild.member.GuildMemberLeaveEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;
import main.Prefix;

public class GuildMemberLeave extends ListenerAdapter implements Prefix {
	
	String[] messages = {
			"[member] has left! :( Goodbye.",
			"Wait... [member] is finally gone! Woo!",
			"Today is a great day. [member] has left!",
			"Goodbye [member]!"
	};
	
	public void onGuildMemberLeave(GuildMemberLeaveEvent e) {
		
		Random rand = new Random();
		int number = rand.nextInt(messages.length);
		
		EmbedBuilder leave = new EmbedBuilder();
		leave.setColor(colorID.hashCode());
		leave.setDescription(messages[number].replace("[member]", e.getMember().getAsMention()));
		
		e.getGuild().getDefaultChannel().sendMessage(leave.build()).queue();
		
		leave.clear();
		
		
	}

}
