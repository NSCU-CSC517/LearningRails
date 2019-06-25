public class InterfaceSegregationPrincipleGood {
    public static void main(String[] args){
        SingleplayerGame singleplayerGame = new SingleplayerGame();
        MultiplayerGame multiplayerGame = new MultiplayerGame();

        singleplayerGame.getGameName();
        singleplayerGame.pauseGame();

        multiplayerGame.getGameName();
        multiplayerGame.getServerList();
    }
}
