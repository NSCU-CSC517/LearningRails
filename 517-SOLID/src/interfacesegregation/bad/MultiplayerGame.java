package interfacesegregation.bad;

public class MultiplayerGame implements Game {

	public void getGameName() {
		System.out.println("Multiplayer Game");
	}

	public void getServerList() {
		System.out.println("US-East, US-West, Europe");
	}
	
	public void pauseGame() {
		//An online multiplayer game can't be paused
		throw new UnsupportedOperationException();
	}


}
