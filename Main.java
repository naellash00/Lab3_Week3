import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // (1). Test Media Class:
        System.out.println("MEDIA CLASS: ");
        Media media1 = new Media();
        media1.setTitle("hello");
        media1.setAuteur("alsh");
        media1.setISBN("1234");
        media1.setPrice(5.5);
        System.out.println(media1.toString());
        Media media2 = new Media("world", "hasan", "4567", 5);
        System.out.println("Title: " + media2.getTitle() + "\nAuteru: " + media2.getAuteur());
        System.out.println("ISBN: " + media2.getISBN() + "\nPrice: " + media2.getPrice());
        System.out.println("Media Type: " + media2.getMediaType());

        System.out.println("******************************");
        //(2). Test Book and review and user
        Review review1 = new Review("na", 5.5, "nice");
        Review review2 = new Review("he", 1.3, "dislike");
        ArrayList<Review> reviews = new ArrayList<>();
        reviews.add(review1);
        reviews.add(review2);
        Book book1 = new Book("Intro To Algorithms", "tu", "1234", 10.6, 15, reviews);

        System.out.println(book1.getAverageRating());
        System.out.println(book1.getStock());
        System.out.println(book1.isBestSeller());
        System.out.println(book1.getMediaType());

        Review review3 = new Review("nae200", 4.5, "nice");
        Review review4 = new Review("ahmad19", 4.8, "cool");
        ArrayList<Review> reviewsList2 = new ArrayList<>();
        reviewsList2.add(review3);
        reviewsList2.add(review4);
        Book book2 = new Book("POWER", "robert", "4567", 50, 10, reviewsList2);
        System.out.println(book2.toString());
        User nae200 = new User();
        nae200.addToCart(book2);
        book2.purchase(nae200, book2);
        book2.setStock(0);
        User ahmad19 = new User();
        ahmad19.addToCart(book2);
        book2.purchase(ahmad19, book2);
        book2.restock(3);
        book2.purchase(ahmad19, book2);

        System.out.println("******************************");
        // (3). Test Movie and user
        Movie movie1 = new Movie();
        movie1.setAuteur("bryan");
        movie1.setDuration(200);
        movie1.setTitle("Ailen");
        System.out.println(movie1.toString());
        System.out.println(movie1.getMediaType());
        Movie psychoMovie = new Movie("psycho", "bryan", "9876", 50, 110);
        Movie halloweenMovie = new Movie("halloween", "tom", "4321", 43.4, 130);
        Movie conjuringMovie = new Movie("conjuring", "bryan", "5678", 45.8, 90);
        ArrayList<Movie> horrorMovies = new ArrayList<>();
        horrorMovies.add(psychoMovie);
        horrorMovies.add(halloweenMovie);
        horrorMovies.add(conjuringMovie);
        Movie jawsMovie = new Movie("jaws", "bryan", "4326", 56.7, 95);
        System.out.println(jawsMovie.recommendSimilarMovies(horrorMovies, jawsMovie));
        System.out.println(jawsMovie.toString());
        User leen30 = new User();
        leen30.setUsername("leen30");
        halloweenMovie.watch(leen30, halloweenMovie);
        System.out.println(leen30.getPurchaseMediaList());
        System.out.println(psychoMovie.getDuration());
        System.out.println(psychoMovie.getMediaType());

        System.out.println("******************************");
        // (4).Test Music
        Music music1 = new Music();
        music1.setArtist("kai");
        music1.setPrice(20);
        music1.setTitle("rover");
        System.out.println(music1.toString());

        Music music2 = new Music("flower", "vic", "5678", 9, "vic");
        Music music3 = new Music("forever", "kris", "6543", 12, "kris");
        Music music4 = new Music("angel", "vic", "5678", 10, "vic");
        Music music5 = new Music("hello", "kris", "8721", 7, "kris");
        ArrayList<Music> musicCatalog = new ArrayList<>();
        musicCatalog.add(music2);
        musicCatalog.add(music3);
        musicCatalog.add(music4);
        musicCatalog.add(music5);
        Music music6 = new Music("letsGo", "vic", "1234", 11.5, "vic");
        System.out.println(music6.generalPlayList(musicCatalog, music6));
        music5.listen(leen30, music5);
        System.out.println("Media List 1: " + leen30.getPurchaseMediaList());
        music1.listen(nae200, music1);
        System.out.println("Media List 2: " + nae200.getPurchaseMediaList());
        music3.listen(ahmad19, music3);
        System.out.println("Media List 3: " + ahmad19.getPurchaseMediaList());

        System.out.println("******************************");
        //(5). Test Novel And Academic Book
        Novel novel1 = new Novel();
        novel1.setGenre("history");
        System.out.println(novel1.getGenre());
        novel1.setAuteur("lucas");
        novel1.setTitle("discover history");
        System.out.println(novel1.toString());

        AcademicBook academicBook = new AcademicBook();
        academicBook.setSubject("Math");
        academicBook.setTitle("Intro to Algebra");
        academicBook.setAuteur("Dr. jessica lucas");
        System.out.println(academicBook.toString());

        System.out.println("******************************");
        //(6). Test Store:
        Store store1 = new Store();
        ArrayList<User> theUsers = new ArrayList<>();
        theUsers.add(leen30);
        theUsers.add(nae200);
        theUsers.add(ahmad19);
        for (User user : theUsers) {
            store1.addUser(user);
        }
        ArrayList<Media> theMedias = new ArrayList<>();
        theMedias.add(book2);
        theMedias.add(book1);
        theMedias.add(music2);
        theMedias.add(movie1);
        for (Media media : theMedias) {
            store1.addMedia(media);
        }

        System.out.println("Display users:");
        store1.displayUsers();

        System.out.println("Display medias:");
        store1.displayMedias();

    }
}