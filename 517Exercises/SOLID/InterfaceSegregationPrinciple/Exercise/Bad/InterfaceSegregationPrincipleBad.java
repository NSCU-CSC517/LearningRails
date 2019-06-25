public class InterfaceSegregationPrincipleBad {
    public static void main(String[] args){
        SingleplayerGame singleplayerGame = new SingleplayerGame();
        MultiplayerGame multiplayerGame = new MultiplayerGame();

        singleplayerGame.getGameName();
        singleplayerGame.pauseGame();
        // Line below throws an exception
        // singleplayerGame.getGameName();

        multiplayerGame.getGameName();
        multiplayerGame.getServerList();
        // Line below throws an exception
        // multiplayerGame.pauseGame();
    }
}
