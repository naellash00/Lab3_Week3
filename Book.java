import java.util.ArrayList;

public class Book extends Media {
    private int stock;
    private ArrayList<Review> review = new ArrayList<>();

    public Book() {

    }

    public Book(int stock, ArrayList<Review> review) {
        this.stock = stock;
        this.review = review;
    }

    public Book(String title, String auteur, String ISBN, double price, int stock, ArrayList<Review> review) {
        super(title, auteur, ISBN, price);
        this.stock = stock;
        this.review = review;
    }


    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    // other methods
    public void addReview(Review r) {
        review.add(r);
    }

    public double getAverageRating() {
        // sum of all individual rating / total number of ratings
        double individualRating = 0;
        for (int i = 0; i < review.size(); i++) {
            individualRating += review.get(i).getRating();
        }
        return individualRating / review.size();
    }

    public void purchase(User user, Media media) {
        // when user purchase media -> check if it in stock and in the cart
        // -> remove it from cart -> add it to purchase list
        // but HOW TO REACH THE MEDIA ITEM from user? adding media in parameter
        if (stock > 0 && user.getShoppingCart().contains(media)) {
            user.removeFromCart(media);
            user.setPurchaseMediaList(media);
            setStock(stock - 1);
            System.out.println("Purchase Successful");
        } else if (!user.getShoppingCart().contains(media))
            System.out.println("Book Is Not In Cart");
        else
            System.out.println("Book Is Out Of Stock");
    }

    public boolean isBestSeller() {
        if (getAverageRating() >= 4.5)
            return true;
        return false;
    }

    public void restock(int quantity) {
        setStock(stock += quantity);
        System.out.println("The Book Has Been Restocked Successfully");

    }

    public String getMediaType() {
        if (getAverageRating() >= 4.5)
            return "Bestselling Book";
        return "Book";
    }

    public String toString() {
        return  "Title: " + super.getTitle() + "\nAuthor: " + super.getAuteur() + "\nStock: " + stock
                + "\nAverage rating: " + getAverageRating() + "\nMedia Type: " + getMediaType();
    }


}
