import java.util.ArrayList;

public class Music extends Media {
    private String artist;

    public Music() {

    }

    public Music(String title, String auteur, String ISBN, double price, String artist) {
        super(title, auteur, ISBN, price);
        this.artist = artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    public void listen(User user, Music music) {
        user.setPurchaseMediaList(music);
        user.removeFromCart(music);

    }

    public ArrayList<Music> generalPlayList(ArrayList<Music> musicCatalog, Music music) {
        ArrayList<Music> similarSongs = new ArrayList<>();
        for (int i = 0; i < musicCatalog.size(); i++) {
            if(musicCatalog.get(i).getArtist().equals(music.getArtist())){
                similarSongs.add(musicCatalog.get(i));
            }
        }
        return similarSongs;
    }

    public String getMediaType() {
        if (super.getPrice() >= 10)
            return "Premium Music";
        return "Music";
    }

    public String toString() {
        return "Artist: " + artist + "\nSong name: " + super.getTitle()
                + "\nMedia Type: " + getMediaType();
    }

}
