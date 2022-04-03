package javafx.quanlydssp;

import javafx.scene.control.*;
import javafx.scene.paint.Paint;
import javafx.scene.text.Text;

import java.util.ArrayList;

public class Controller {
    public TextField inputID, inputName, inputUnit, inputPrice, inputQuantity;
    public ArrayList<Products> productsList = new ArrayList<Products>();
    public Text msgE_S;
    public TextArea outputID, outputName, outputUnit, outputPrice, outputQuantity;


    public void addProducts() {
        try {
            if (inputID.getText().isEmpty() || inputName.getText().isEmpty() ||
                    inputUnit.getText().isEmpty() || inputPrice.getText().isEmpty() || inputQuantity.getText().isEmpty()) {
                //isEmpty() <=> == ""
                throw new Exception("Please enter full product information!");
            }
//            else if (!inputPrice.getText().matches("\\f+") || !inputQuantity.getText().matches("\\d+")){  //check input type
//                throw new Exception("Price or Quantity must be entered in numbers.");
//            }

            //add products
            productsList.add(new Products(inputID.getText(), inputName.getText(), inputUnit.getText(),
                    Float.parseFloat(inputPrice.getText()), Integer.parseInt(inputQuantity.getText())));
            msgE_S.setFill(Paint.valueOf("BLUE"));  //đặt màu cho text
            msgE_S.setText("Add Product Success!");     //đặt text cho text
            msgE_S.setVisible(true);    //hiện thông báo

            //xuất ra list
            outputID.setText(outputID.getText() + "\n-----------------\n" + inputID.getText()); //ID Products + ----- + Input ID
            outputName.setText(outputName.getText() + "\n-------------------------------\n" + inputName.getText());
            outputUnit.setText(outputUnit.getText() + "\n---------------------\n" + inputUnit.getText());
            outputPrice.setText(outputPrice.getText() + "\n--------------------\n" + inputPrice.getText());
            outputQuantity.setText(outputQuantity.getText() + "\n----------------\n" + inputQuantity.getText());

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
