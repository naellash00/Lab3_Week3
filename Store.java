import java.util.ArrayList;

public class Store {
    private ArrayList<User> users = new ArrayList<>();
    private ArrayList<Media> medias = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
    }

    public void displayUsers() {
        for (User user : users) {
            System.out.print(user + " ");
        }
    }

    public void addMedia(Media media) {
        medias.add(media);
    }

    public void displayMedias() {
        for (Media media : medias) {
            System.out.print(media + " ");
        }
    }

    public void searchBook(String title) {
        boolean isExist = false;
        for (int i = 0; i < medias.size(); i++) {
            if (medias.get(i) instanceof Book && medias.get(i).getTitle().equalsIgnoreCase(title)) {
                isExist = true;
                break;
            }
        }
        if (isExist)
            System.out.println("The Book Exist");
        else
            System.out.println("Book Dose Not Exist");

    }
}
