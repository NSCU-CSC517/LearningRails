class Movie implements VideoFunctions {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    @Override
    public void playMovie() {
        System.out.println("Playing movie: " + name);
    }

    @Override
    public void stopMovie() {
        System.out.println("Stopped movie: " + name);
    }

    @Override
    public void deleteMovie() {
        System.out.println("Deleting movie: " + name);
    }

    @Override
    public String getMovieDetails() {
        if (name.equalsIgnoreCase("The Prestige"))
            return "Movie:\n    Name: The Prestige\n    Size: 1023 MB\n    Director: Christopher Nolan";
        else
            return "Movie:\n    Details not available";
    }
}
