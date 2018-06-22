package interfacesegregation.bad;

public class SingleplayerGame implements Game {

	public void getScore() {
		System.out.println("The player has 100 points");
	}
	
	public void getGameName() {
		System.out.println("Singleplayer Game");		
	}

	public void getServerList() {
		//A singleplayer game has no servers
		throw new UnsupportedOperationException();
	}


}
