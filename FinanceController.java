import java.io.IOException;
import java.lang.classfile.components.ClassPrinter.Node;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FinanceController {

 private Stage stage;
 private Scene scene;
 private Parent root;
 public void switchToFinance(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("Finance.fxml"));
        stage = (Stage)((javafx.scene.Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    
 }
        public void switchToTransaction(ActionEvent event) throws IOException{
          FXMLLoader loader = new FXMLLoader(getClass().getResource("Transaction.fxml"));
          Parent root = loader.load(); // this will also load TransactionController correctly
        stage = (Stage)((javafx.scene.Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();  
 
}


}

