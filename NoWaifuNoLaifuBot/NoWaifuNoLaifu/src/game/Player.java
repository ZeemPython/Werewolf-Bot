package game;

import java.util.List;

public class Player {

	String name;
	String role;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public void toString(List<Player> playerList) {

		for (int i = 0; i < playerList.size(); i++) {

			System.out.println(playerList.get(i).getName());

		}

	}
}
