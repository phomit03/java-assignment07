package javafx_quanlydssp;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    //khởi tạo 1 mảng có đích chung là class Main
    public static ObservableList<Products> productsList = FXCollections.observableArrayList();

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("form.fxml"));
        primaryStage.setTitle("Quản Lý Danh Sách Sản Phẩm");
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.show();
    }


    public static void main(String[] args) {
        //add sẵn 2 sản phẩm
        productsList.add(new Products("P01", "Bánh Kẹo", "Gói", 5.000, 50));
        productsList.add(new Products("P01", "Nước Ngọt", "Chai", 10.000, 250));
        launch(args);
    }
}
