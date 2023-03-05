module com.example.bookadd {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.bookadd to javafx.fxml;
    exports com.example.bookadd;
}