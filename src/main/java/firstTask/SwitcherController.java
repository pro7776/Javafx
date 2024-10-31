package firstTask;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class SwitcherController {
    @FXML
    private TextField textField1, textField2;
    @FXML
    private Button switchButton;
    private boolean toSecondField = true;

    @FXML
    private void switchText() {
        if (toSecondField) {
            textField2.setText(textField1.getText());
            textField1.clear();
            switchButton.setText("↑");
        } else {
            textField1.setText(textField2.getText());
            textField2.clear();
            switchButton.setText("↓");
        }
        toSecondField = !toSecondField;
    }
}
