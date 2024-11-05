import java.util.ArrayList;

public class Movie extends Media {
    private int duration;

    public Movie() {

    }

    public Movie(String title, String auteur, String ISBN, double price, int duration) {
        super(title, auteur, ISBN, price);
        this.duration = duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void watch(User user, Media media) {
        user.getPurchaseMediaList().add(media);
        user.removeFromCart(media);

    }

    public ArrayList<Movie> recommendSimilarMovies(ArrayList<Movie> movieCatalog, Movie movie) {
        // user send punch of movies (movie catalog) and based on some movie
        // want to find the similar movies to it (compare the movie catalod to movie object author)
        ArrayList<Movie> theSimilarMovies = new ArrayList<>();
        for (int i = 0; i < movieCatalog.size(); i++) {
            if (movieCatalog.get(i).getAuteur().equals(movie.getAuteur())) {
                theSimilarMovies.add(movieCatalog.get(i));
            }
        }
        return theSimilarMovies;
    }

    public String getMediaType() {
        if (duration >= 120)
            return "Long Movie";
        return "Movie";
    }

    public String toString() {
        return "Movie title: " + super.getTitle() + "\nDirector: " + super.getAuteur() + "\nDuration: " + duration;
    }
}
