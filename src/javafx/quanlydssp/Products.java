package javafx.quanlydssp;

public class Products {
    public String productID;
    public String name;
    public String unit;
    public Float price;
    public Integer quantity;

    //contructor
    public Products() {
    }
    public Products(String productID, String name, String unit, Float price, Integer quantity) {
        this.productID = productID;
        this.name = name;
        this.unit = unit;
        this.price = price;
        this.quantity = quantity;
    }

    //getter & setter
    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    //Input
    public String inputProducts(){
        String s = "";
        s += getProductID();
        s += getName();
        s += getUnit();
        s += getPrice();
        s += getQuantity();
        return s;
    }
}
