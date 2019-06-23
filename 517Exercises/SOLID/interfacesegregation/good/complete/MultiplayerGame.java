package interfacesegregation.good.complete;
public class MultiplayerGame implements BasicGame, OnlineGame {

	public void getServerList() {
		System.out.println("US-East, US-West, Europe");
	}

	public void getGameName() {
		System.out.println("Multiplayer Game");
	}

}
