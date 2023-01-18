package com.example.resultsopener;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        String filePath = "C:\\Users\\user\\IdeaProjects\\FirstJavaProject\\Results.txt";
        String results;
        try {
            results = new String(Files.readAllBytes(Paths.get(filePath)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        welcomeText.setText(results);
    }
}