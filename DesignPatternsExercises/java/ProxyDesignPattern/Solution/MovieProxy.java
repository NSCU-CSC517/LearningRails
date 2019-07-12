// class MovieProxy __________(2)__________ VideoFunctions {
class MovieProxy implements VideoFunctions {
    private Movie movie;

    public MovieProxy(String name) {
        // movie = __________(3)__________(name);
        movie = new Movie(name);
    }

    @Override
    public void playMovie() {
        // movie.__________(4)__________();
        movie.playMovie();
    }

    @Override
    public void stopMovie() {
        // movie.__________(5)__________();
        movie.stopMovie();
    }

    @Override
    // public void __________(6)__________() {
    public void deleteMovie() {
        System.out.println("Deleting movie: Permission denied!!!");
    }

    @Override
    public String getMovieDetails() {
        // return movie.__________(7)__________();
        return movie.getMovieDetails();
    }
}
