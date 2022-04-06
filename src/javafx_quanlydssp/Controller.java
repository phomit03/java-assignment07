package javafx_quanlydssp;

import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.paint.Paint;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    public TextField inputID, inputName, inputUnit, inputPrice, inputQuantity;
    public ArrayList<Products> productsList = new ArrayList<Products>();
    public Text msgE_S;
    //khai báo table view cho controller
    public TableView<Products> tbProducts;
    public TableColumn<Products, String> cID, cName, cUnit;
    public TableColumn<Products, Double> cPrice;
    public TableColumn<Products, Integer> cQuantity;

    //override method của Initializable
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        cID.setCellValueFactory(new PropertyValueFactory<Products, String>("inputID"));
        cName.setCellValueFactory(new PropertyValueFactory<Products, String>("inputName"));
        cUnit.setCellValueFactory(new PropertyValueFactory<Products, String>("inputUnit"));
        cPrice.setCellValueFactory(new PropertyValueFactory<Products, Double>("inputPrice"));
        cQuantity.setCellValueFactory(new PropertyValueFactory<Products, Integer>("inputQuantity"));
        tbProducts.setItems(Main.productsList);
    }

    public void addProducts(){
        try {
            if (inputID.getText().isEmpty() || inputName.getText().isEmpty() ||
                    inputUnit.getText().isEmpty() || inputPrice.getText().isEmpty() || inputQuantity.getText().isEmpty()) {
                //isEmpty() <=> == ""
                throw new Exception("Please enter full product information!");
            }
//            else if (!inputPrice.getText().matches("\\f+") || !inputQuantity.getText().matches("\\d+")){  //check input type
//                throw new Exception("Price or Quantity must be entered in numbers.");
//            }

            //thêm products
            Products p = new Products(inputID.getText(), inputName.getText(), inputUnit.getText(),
                    Double.parseDouble(inputPrice.getText()), Integer.parseInt(inputQuantity.getText()));
            msgE_S.setFill(Paint.valueOf("BLUE"));  //đặt màu cho text
            msgE_S.setText("Add Product Success!");     //đặt text cho text
            msgE_S.setVisible(true);    //hiện thông báo

            Main.productsList.add(p);   //xuất ra list

            //xuất ra list
//            outputID.setText(outputID.getText() + "\n-----------------\n" + inputID.getText()); //ID Products + ----- + Input ID
//            outputName.setText(outputName.getText() + "\n-------------------------------\n" + inputName.getText());
//            outputUnit.setText(outputUnit.getText() + "\n---------------------\n" + inputUnit.getText());
//            outputPrice.setText(outputPrice.getText() + "\n--------------------\n" + inputPrice.getText());
//            outputQuantity.setText(outputQuantity.getText() + "\n----------------\n" + inputQuantity.getText());



            //reset lệnh nhập
            inputID.setText("");
            inputName.setText("");
            inputUnit.setText("");
            inputPrice.setText("");
            inputQuantity.setText("");

        } catch (NumberFormatException e) {  //kiểm tra về số
            msgE_S.setVisible(true);
            msgE_S.setFill(Paint.valueOf("RED"));
            msgE_S.setText("Price & Quantity must be entered in numbers.");
        } catch (Exception e) {
            msgE_S.setVisible(true);
            msgE_S.setFill(Paint.valueOf("RED"));
            msgE_S.setText(e.getMessage());
        }

    }

}