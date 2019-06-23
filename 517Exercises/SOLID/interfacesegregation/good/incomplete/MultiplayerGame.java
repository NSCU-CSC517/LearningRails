package interfacesegregation.good.incomplete;
									             //1
public class MultiplayerGame implements BasicGame, ____ {

	public void getServerList() {
		System.out.println("US-East, US-West, Europe");
	}
			   //2
	public void ____() {
		System.out.println("Multiplayer Game");
	}

}
