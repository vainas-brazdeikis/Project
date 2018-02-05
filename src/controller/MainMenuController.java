package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class MainMenuController {

    @FXML
    private BorderPane mainPane;


    public void setView(Pane pane) {
        mainPane.setCenter(pane);
    }

    @FXML
    public void openLobbyPane(ActionEvent event) throws IOException {
        MenuNavigator.loadView(MenuNavigator.LOBBY);
    }
}
