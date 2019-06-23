package interfacesegregation.good.complete;

public class SingleplayerGame implements BasicGame, PausableGame {

	public void getGameName() {
		System.out.println("Singleplayer Game");		
	}
	
	public void pauseGame() {
		System.out.println("Pausing game...");
	}


}
