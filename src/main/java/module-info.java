module firstTask {
    requires javafx.controls;
    requires javafx.fxml;


    exports firstTask;
    opens firstTask to javafx.fxml;
    exports thirdTask;
    opens thirdTask to javafx.fxml;

}