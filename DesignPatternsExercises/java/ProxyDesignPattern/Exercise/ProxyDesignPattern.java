public class ProxyDesignPattern {
    public static void main(String[] args) {
        VideoFunctions movieProxy = new MovieProxy("The Prestige");
        System.out.println(movieProxy.getMovieDetails());
        movieProxy.playMovie();
        movieProxy.stopMovie();
        movieProxy.deleteMovie();
    }
}
