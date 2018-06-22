package interfacesegregation.good.incomplete;
													//4
public class SingleplayerGame implements BasicGame, ____ {

	public void getGameName() {
		System.out.println("Singleplayer Game");		
	}
				//5
	public void ____() {
		System.out.println("Pausing game...");
	}


}
