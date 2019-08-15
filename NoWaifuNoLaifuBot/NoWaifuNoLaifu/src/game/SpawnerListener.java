package game;

import java.util.Random;

import main.Prefix;
import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class SpawnerListener extends ListenerAdapter implements Prefix {

	String[] spawns = { "Kirito Spawned!", "Asuna Spawned!", "Kamina Spawned!", "Pikachu Spawned!",
			"Azim Spawned! HOLY SHIT!", "Subi Spawned! WATCH OUT!!", "Something smells... oh wait. It's just Ubaid!!",
			"Run!! KRIS SPAWNED!! DOOOYYYYY" };

	public void onGuildMessageReceived(GuildMessageReceivedEvent e) {

		// String[] args = e.getMessage().getContentRaw().split("\\s+");
		
		Random rand = new Random();
		int number = rand.nextInt(spawns.length);

		EmbedBuilder spawner = new EmbedBuilder();

		spawner.setColor(colorID.hashCode());
		spawner.setDescription(spawns[number]);

		e.getChannel().sendMessage(spawner.build()).queue();
		spawner.clear();
		System.out.println("got a message");
		return;

	}

}
