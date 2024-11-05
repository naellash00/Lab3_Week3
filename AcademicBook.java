public class AcademicBook extends Book{
    public String subject;

    public void setSubject(String subject){
        this.subject = subject;
    }
    public String getSubject(){
        return subject;
    }
    public String getMediaType(){
        if(super.getAverageRating() >= 4.5)
            return "Bestselling AcademicBook";
        return "Academic Book";
    }
    public String toString(){
        return "Subject: " + subject + "\nTitle: " + super.getTitle()
                + "\nAuthor: " + super.getAuteur();

    }
}
