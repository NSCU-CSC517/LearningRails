public class SingleplayerGame implements Game {

	public void getGameName() {
		System.out.println("Singleplayer Game");		
	}

	public void getServerList() {
		//A singleplayer game has no servers
		throw new UnsupportedOperationException();
	}

	public void pauseGame() {
		System.out.println("Pausing game...");
	}
}
