package ImageHoster.model;

/**
 * Created by vaibhavhajela on 17/01/21.
 */
public class Order {
    private String id;

    public Order(String id, String productName) {
        this.id = id;
        this.productName = productName;
    }

    private String productName;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }



    public Order(){

    }
}
