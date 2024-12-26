module firstTask {
    requires javafx.controls;
    requires javafx.fxml;


    exports one;
    opens one to javafx.fxml;

    exports three;
    opens three to javafx.fxml;

}