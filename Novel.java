public class Novel extends Book{
    private String genre;

    public void setGenre(String genre){
        this.genre = genre;
    }
    public String getGenre(){
        return genre;
    }
    public String getMediaType(){
        if(super.getAverageRating() >= 4.5)
            return "Bestselling Novel";
        return "Novel";
    }
    public String toString(){
        return "Genre: " + genre + "\nTitle: " + super.getTitle()
                + "\nAuthor: " + super.getAuteur();
    }
}
