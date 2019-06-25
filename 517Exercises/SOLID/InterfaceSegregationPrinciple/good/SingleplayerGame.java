// public class SingleplayerGame implements BasicGame, __________(4)__________ {
public class SingleplayerGame implements BasicGame, PausableGame {

	// public void __________(5)__________() {
	public void getGameName() {
		System.out.println("Singleplayer Game");		
	}

	public void pauseGame() {
		System.out.println("Pausing game...");
	}

}
