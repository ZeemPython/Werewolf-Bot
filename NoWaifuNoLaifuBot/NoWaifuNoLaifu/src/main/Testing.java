package main;

import java.util.ArrayList;
import java.util.Collections;
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
		
		//p.toString(playerList); //toString the entire list of players
		
	}
	
	public static int playerCount() {
		System.out.print("How many players will there be?: ");
		numOfPlayers = sc.nextInt();
		
		return numOfPlayers;
	}

	public static void populatePlayerList() {
		
		int counter = 1;

		while (counter <= numOfPlayers) {
			Player p = new Player();
			
			System.out.print("Type the name of Player " + counter + ": ");
			p.setName(sc.next());		
			playerList.add(p);
			counter++;
		}
	}
	
	public static void randomUniqueRole() {
		
		
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
		
		giveRoles(ListOfRoles.roles, playerList);
		
	}
	
	public static void giveRoles(List<String> roles, List<Player> playerList) {
		Random rand = new Random();
		int x = rand.nextInt(roles.size());
		
		ListOfRoles.toString(roles);
		
		System.out.println("\n(Shuffled) Player Roles: ");
		Collections.shuffle(roles);
		
	
		//As you loop through the list, display a random role, then remove it from the list.
		for (int i = 0; i < roles.size(); i++) {
			
			
			//Player 1 is role, 2 role, 3 role, etc.
			System.out.print(playerList.get(i).getName() + " " + roles.get(i) + " ");
			//roles.remove(i);

		}
	}


	// int r = rand.nextInt(players.size());
	

}
