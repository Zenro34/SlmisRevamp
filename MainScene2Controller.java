import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.SpinnerValueFactory.IntegerSpinnerValueFactory;

public class MainScene2Controller implements Initializable{
    
        @FXML
        private ListView<String> mylistView;

        @FXML
        private Label mylabel;

        String[] paymentMethod = {"Bank Transfer", "E-Wallet", "Credit Card", "Finance Hours 9AM - 5 PM", };

        String currentpaymentMethod;

        @Override
        public void initialize(URL arg0, ResourceBundle arg1) {
        
            mylistView.getItems().addAll(paymentMethod);
            mylistView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
          
        currentpaymentMethod = mylistView.getSelectionModel().getSelectedItem();
                mylabel.setText("You have selected: " + currentpaymentMethod);
               

            }
          

            });
        
        }
}
