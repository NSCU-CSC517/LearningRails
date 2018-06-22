package interfacesegregation.bad;

public class MultiplayerGame implements Game {

	public void getScore() {
		System.out.println("The player has 0 points");
	}

	public void getGameName() {
		System.out.println("Multiplayer Game");
	}

	public void getServerList() {
		System.out.println("US-East, US-West, Europe");
	}


}
