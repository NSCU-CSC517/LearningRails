public class ProxyDesignPattern {
    public static void main(String[] args) {
        VideoFunctions moviePlayer = new MovieProxy("The Prestige");
        System.out.println(moviePlayer.getMovieDetails());
        moviePlayer.playMovie();
        moviePlayer.stopMovie();
        moviePlayer.deleteMovie();
    }
}
