// public class MultiplayerGame implements BasicGame, __________(1)__________ {
public class MultiplayerGame implements BasicGame, OnlineGame {

	public void getServerList() {
		System.out.println("US-East, US-West, Europe");
	}

	// public void __________(2)__________() {
	public void getGameName() {
		System.out.println("Multiplayer Game");
	}
}
