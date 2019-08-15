package main;

import javax.security.auth.login.LoginException;

import commands.Clear;
import commands.InfoCommands;
import commands.StartGame;
import commands.Stats;
import events.GuildMemberJoin;
import events.GuildMemberLeave;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.OnlineStatus;
import net.dv8tion.jda.core.entities.Game;
import net.dv8tion.jda.core.events.Event;
import net.dv8tion.jda.core.events.ReadyEvent;

public class Main {

	public static void main(String[] args) throws LoginException {

		JDABuilder builder = new JDABuilder();
		builder.setToken("MzM4MTU1NDcwMjYxMDU5NTg0.XVTfWg.Q6D6_IYJGfre7Vf386-JAEA9oHA");
		builder.setStatus(OnlineStatus.ONLINE);
		builder.setGame(Game.playing("with kids"));
		
		// Register listeners
		builder.addEventListener(
				
				new InfoCommands(), 
				new Clear(), 
				new Stats(), 
				new GuildMemberJoin(), 
				new GuildMemberLeave(),
				new StartGame()
		);

		builder.build();
		
		
		

	}
	
}
