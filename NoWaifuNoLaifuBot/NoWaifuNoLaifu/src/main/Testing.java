package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import game.ListOfRoles;
import game.Player;

public class Testing {

	public static List<Player> playerList = new ArrayList<>();
	public static Scanner sc = new Scanner(System.in);
	public static int numOfPlayers;
	

	public static void main(String[] args) {
		Player p = new Player(); //make new instance of player
		
		playerCount(); 			// get player count,
		populatePlayerList(); 	// populate player list based on num of players
		randomUniqueRole();		// give a random unique role to each player, removing the role from the list as we go
		
		p.toString(playerList); //toString the entire list of players

	}
	
	public static int playerCount() {
		System.out.println("How many players will there be?");
		numOfPlayers = sc.nextInt();
		
		return numOfPlayers;
	}

	public static void populatePlayerList() {
		
		int counter = 1;

		while (counter <= numOfPlayers) {
			Player p = new Player();
			
			System.out.println("Type the name of Player " + counter);
			p.setName(sc.next());		
			playerList.add(p);
			counter++;
		}
	}
	
	public static void randomUniqueRole() {
		Random rand = new Random();
		
		switch(numOfPlayers) {
		
		case 5: 
			ListOfRoles.populate5();
			break;
			
		case 6:
			ListOfRoles.populate6();
			break;
			
		case 7:
			ListOfRoles.populate7();
			break;
			
		case 8:
			ListOfRoles.populate8();
			break;
			
		case 9:
			ListOfRoles.populate9();
			break;
			
		}
		
		giveRoles(ListOfRoles.roles);
		
	}
	
	public static void giveRoles(List<String> roles) {
		
		for (int i = 0; i < playerList.size(); i++) {

			System.out.println(playerList.get(i).getName());

		}
		
	}

	// players.add("azim");
	// players.add("bilal");
	// players.add("shahid");


	// int r = rand.nextInt(players.size());
	// int x = rand.nextInt(roles.size());

}
