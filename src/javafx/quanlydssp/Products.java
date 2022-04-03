package javafx.quanlydssp;

public class Products {
    public String inputID, inputName, inputUnit;
    public Float inputPrice;
    public Integer inputQuantity;

    //contructor
    public Products() {
    }
    public Products(String inputID, String inputName, String inputUnit, Float inputPrice, Integer inputQuantity) {
        this.inputID = inputID;
        this.inputName = inputName;
        this.inputUnit = inputUnit;
        this.inputPrice = inputPrice;
        this.inputQuantity = inputQuantity;
    }

    //getter & setter
    public String getInputID() {
        return inputID;
    }

    public void setInputID(String inputID) {
        this.inputID = inputID;
    }

    public String getInputName() {
        return inputName;
    }

    public void setInputName(String inputName) {
        this.inputName = inputName;
    }

    public String getInputUnit() {
        return inputUnit;
    }

    public void setInputUnit(String inputUnit) {
        this.inputUnit = inputUnit;
    }

    public Float getInputPrice() {
        return inputPrice;
    }

    public void setInputPrice(Float inputPrice) {
        this.inputPrice = inputPrice;
    }

    public Integer getInputQuantity() {
        return inputQuantity;
    }

    public void setInputQuantity(Integer inputQuantity) {
        this.inputQuantity = inputQuantity;
    }

    //Input
//    public String inputProducts(){
//        String s = "";
//        s += getInputID();
//        s += getInputName();
//        s += getInputUnit();
//        s += getInputPrice();
//        s += getInputQuantity();
//        return s;
//    }
}
