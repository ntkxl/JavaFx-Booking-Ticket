package cinema;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class Theatre2 extends  Cinema{
    @FXML
    Button backtofirst ;

    @Override
    public void backToFirstPage(ActionEvent event) throws IOException {
        super.backToFirstPage(event);
    }
}
