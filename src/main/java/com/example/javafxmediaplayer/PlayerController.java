package com.example.mediaplayer;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class PlayerController implements Initializable {
    @FXML
    private Label text;

    @FXML
    protected void onPlayButtonClick() {
        text.setText("Video Playing");
    }
    @FXML
    protected void onPauseButtonClick() {
        text.setText("Video Paused");
    }
    @FXML
    protected void onResetButtonClick() {
        text.setText("Video Reset");
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}