class MovieProxy __________(2)__________ VideoFunctions {
    private Movie movie;

    public MovieProxy(String name) {
        movie = __________(3)__________(name);
    }

    @Override
    public void playMovie() {
        movie.__________(4)__________();
    }

    @Override
    public void stopMovie() {
        movie.__________(5)__________();
    }

    @Override
    public void __________(6)__________() {
        System.out.println("Deleting movie: Permission denied!!!");
    }

    @Override
    public String getMovieDetails() {
        return movie.__________(7)__________();
    }
}
