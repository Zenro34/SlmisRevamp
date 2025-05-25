import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class MainSceneController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField tfTitle;

    @FXML
    private TextField tfTitle1;

    @FXML
    void btnOkClicked(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert tfTitle != null : "fx:id=\"tfTitle\" was not injected: check your FXML file 'MainScene.fxml'.";
        assert tfTitle1 != null : "fx:id=\"tfTitle1\" was not injected: check your FXML file 'MainScene.fxml'.";

    }

}
