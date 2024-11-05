import java.util.ArrayList;

public class User {
    private String username;
    private String email;
    //private Media[] purchaseMediaList;
    private ArrayList<Media> purchaseMediaList = new ArrayList<>();
    //private Media[] shoppingCart;
    private ArrayList<Media> shoppingCart = new ArrayList<>();

    public User(){

    }
    public User(String username, String email, ArrayList<Media> purchaseMediaList, ArrayList<Media> shoppingCart){
        this.username = username;
        this.email = email;
        this.purchaseMediaList = purchaseMediaList;
        this.shoppingCart = shoppingCart;
    }

    // setters
    public void setUsername(String username){
        this.username = username;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setPurchaseMediaList(Media media){
       // this.purchaseMediaList = purchaseMediaList;
        //purchaseMediaList.add
        purchaseMediaList.add(media);
    }
//    public void setShoppingCart(Media media){
//       // this.shoppingCart = shoppingCart;
//        shoppingCart.add(media);
//    }
    //getters
    public String getUsername(){
        return username;
    }
    public String getEmail(){
        return email;
    }
    public ArrayList<Media> getPurchaseMediaList(){
        return purchaseMediaList;
    }
    public ArrayList<Media> getShoppingCart(){
        return shoppingCart;
    }

    public void addToCart(Media media){
      //  purchaseMediaList.remove(media);
        shoppingCart.add(media);
    }
    public void removeFromCart(Media media){
        //purchaseMediaList.add(media);
        shoppingCart.remove(media);
    }
    public void checkOut(){
        // complete the purchase and update purchase media list and stock
        //Media media = new Media();
       // purchaseMediaList.add(media);
        if(shoppingCart.isEmpty()){

        }
    }

}
