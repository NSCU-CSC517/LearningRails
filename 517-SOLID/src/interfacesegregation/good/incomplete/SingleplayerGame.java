package interfacesegregation.good.incomplete;
													//4
public class SingleplayerGame implements BasicGame, ____ {

	public void ___() { //5
		System.out.println("Singleplayer Game");		
	}
				
	public void pauseGame() {
		System.out.println("Pausing game...");
	}


}
