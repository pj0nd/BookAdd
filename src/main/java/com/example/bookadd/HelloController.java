package com.example.bookadd;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    TextField Author;

    @FXML
    TextField Title;

    @FXML
    TextField Series;

    @FXML
    TextField Comments;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Congrats! Book added to database!");
    }
}