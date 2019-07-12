class Movie __________(1)__________ VideoFunctions {
    private String name;
    private int size;
    private String director;

    public Movie(String name) {
        this.name = name;
        this.size = 1023;
        this.director = "Christopher Nolan";
    }

    @Override
    public void playMovie() {
        System.out.println("Playing movie: " + name);
    }

    @Override
    public void stopMovie() {
        System.out.println("Stopping movie: " + name);
    }

    @Override
    public void deleteMovie() {
        System.out.println("Deleting movie: " + name);
    }

    @Override
    public String getMovieDetails() {
        return "Movie Details:\n    Name: " + name + "\n    Size: " + size + "MB\n    Director: " + director;
    }
}
