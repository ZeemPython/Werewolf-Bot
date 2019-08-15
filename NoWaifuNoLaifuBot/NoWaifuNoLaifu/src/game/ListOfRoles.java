package game;

import java.util.ArrayList;
import java.util.List;

public class ListOfRoles {
	
	public static List<String> roles = new ArrayList<>();

	public static void populate5() {
		
		roles.add("Werewolf");
		roles.add("Sorcerer");
		roles.add("Seer");
		roles.add("Hunter");
		roles.add("Villager1");
	
	}
	
	public static void populate6() {
		
		roles.add("Werewolf");
		roles.add("Sorcerer");
		roles.add("Seer");
		roles.add("Hunter");
		roles.add("Villager1");
		roles.add("Villager2");
	
	}
	
	public static void populate7() {
		
		roles.add("Werewolf"); 
		roles.add("Sorcerer");
		roles.add("Seer");
		roles.add("Hunter");
		roles.add("Doctor");
		roles.add("Villager1");
		roles.add("Villager2");
		
	}
	
	public static void populate8() {
		
		roles.add("Werewolf");
		roles.add("Sorcerer");
		roles.add("Seer");
		roles.add("Hunter");
		roles.add("Doctor");
		roles.add("Villager1");
		roles.add("Villager2");
		roles.add("Villager3");
		
	}
	
	public static void populate9() {
		
		roles.add("Werewolf");
		roles.add("Sorcerer");
		roles.add("Seer");
		roles.add("Hunter");
		roles.add("Doctor");
		roles.add("Villager1");
		roles.add("Villager2");
		roles.add("Villager3");
		roles.add("Villager4");
		
	}
	
	public static void toString(List<String> roles) {

		System.out.println("\nList of Roles: ");
		
		for (int i = 0; i < roles.size(); i++) {
			
			System.out.print(roles.get(i) + " ");

		}
		
		System.out.println(" ");

	}
	
}
