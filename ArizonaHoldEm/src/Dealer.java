public class Dealer {
	Player[] players;
	int currentNumberOfPlayers = 0;

	public Dealer(int size) {
		players = new Player[size];
	}

	public void addPlayer(String name) {
		Player player = new Player(name);
		players[currentNumberOfPlayers] = player;
		currentNumberOfPlayers++;

	}

	public String getPlayerNames() {
		String returnString = "";

		for (Player p : players) {
			returnString += p.playerName + " ";
			System.out.println(p.playerName);
		}

		return returnString.trim();
	}

}