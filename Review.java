public class Review {
    private String username;
    private double rating;
    private String comment;
    public Review(){

    }
    public Review(String username, double rating, String comment){
        this.username = username;
        this.rating = rating;
        this.comment = comment;
    }
    // setters
    public void setUsername(String username){
        this.username = username;
    }
    public void setRating(double rating){
        this.rating = rating;
    }
    public void setComment(String comment){
        this.comment = comment;
    }
    // getters
    public String getUsername(){
        return username;
    }
    public double getRating(){
        return rating;
    }
    public String getComment(){
        return comment;
    }
}
