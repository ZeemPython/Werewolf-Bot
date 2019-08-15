package events;

import java.util.Random;

import main.Prefix;
import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.events.guild.member.GuildMemberJoinEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class GuildMemberJoin extends ListenerAdapter implements Prefix {
	
	String[] messages = {
			"[member] has joined! Welcome!",
			"Hello [member], welcome to your new home. :)",
			"Hey! Listen! [member] has joined!",
			"We've been expecting you, [member].",
			"Brace yourselves. [member] just joined the server.",
			"A wild [member] appeared.",
			"Something smells... oh wait. It's just [member]!",
			"Run!! [member] is here!"
	};
	
	public void onGuildMemberJoin(GuildMemberJoinEvent e) {
		
		Random rand = new Random();
		int number = rand.nextInt(messages.length);
		
		EmbedBuilder join = new EmbedBuilder();
		join.setColor(colorID.hashCode());
		join.setDescription(messages[number].replace("[member]", e.getMember().getAsMention()));
		
		e.getGuild().getDefaultChannel().sendMessage(join.build()).queue();
		e.getGuild().getController().addRolesToMember(e.getMember(), e.getGuild().getRolesByName("Member", true)).complete();
		
		join.clear();
		
		return;
	}

}
