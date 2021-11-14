module com.dillanwilken {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    opens com.dillanwilken to javafx.fxml;
    exports com.dillanwilken;
}