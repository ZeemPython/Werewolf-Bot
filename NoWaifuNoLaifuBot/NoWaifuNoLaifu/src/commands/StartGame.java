package commands;

import java.util.Random;

import main.Prefix;
import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.entities.User;
import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class StartGame extends ListenerAdapter implements Prefix {

	public void onGuildMessageReceived(GuildMessageReceivedEvent e) {

		String[] args = e.getMessage().getContentRaw().split("\\s+");
		
		System.out.println(e.getMember().getRoles().contains(e.getGuild().getRoleById("611264310995451955")));
		
		Random rand = new Random();
		//int roleNum = rand.nextInt(roles.length);
		
		User user = e.getAuthor();
		
		if (args[0].equalsIgnoreCase(prefix + "startGame")) {

			//sendPrivateMessage(user, roleNum);
			
		}	
	}

	public void sendPrivateMessage(User user, int roleNum) {

		EmbedBuilder embed = new EmbedBuilder();

		embed.setColor(colorID.hashCode());
		embed.setTitle("Role Request ");
		//embed.setDescription("Your role is: " + roles[roleNum]);

		user.openPrivateChannel().queue((channel) -> {
			// value is a parameter for the `accept(T channel)` method of our callback.
			// here we implement the body of that method, which will be called later by JDA
			// automatically.
			channel.sendMessage(embed.build()).queue();
			// here we access the enclosing scope variable -content-
			// which was provided to sendPrivateMessage(User, String) as a parameter
			embed.clear();
		});
	}

}
