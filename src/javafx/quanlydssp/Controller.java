package javafx.quanlydssp;

import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Controller {
    public Text result;
    public TextField id;
    public TextField name;
    public TextField unit;
    public TextField price;
    public TextField quantity;

    public void addProducts(){
        try {
            Products p = new Products(id.getText(), name.getText(), unit.getText(),
                    Float.parseFloat(price.getText()), Integer.parseInt(quantity.getText()));

            result.setText(result.getText() + "\t" + p.inputProducts());

            id.setText("");
            name.setText("");
            unit.setText("");
            price.setText("");
            quantity.setText("");

        }
        catch (Exception e){

        }
    }

}
