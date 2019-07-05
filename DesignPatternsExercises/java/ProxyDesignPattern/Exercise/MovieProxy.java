class MovieProxy implements VideoFunctions {
    private Movie movie;

    public MovieProxy(String name) {
        movie = __________(1)__________(name);
    }

    @Override
    public void playMovie() {
        movie.__________(2)__________();
    }

    @Override
    public void stopMovie() {
        movie.__________(3)__________();
    }

    @Override
    public void __________(4)__________() {
        System.out.println("Deleting movie: Permission denied!!!");
    }

    @Override
    public String getMovieDetails() {
        return movie.__________(5)__________();
    }
}
