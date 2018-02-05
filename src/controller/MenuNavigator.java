package controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class MenuNavigator {
    public static final String MAINMENU = "/view/MainMenu.fxml";
    public static final String LOBBY = "/view/Lobby.fxml";

    private static MainMenuController mainController;

    public static void setMainController(MainMenuController mainController){
        MenuNavigator.mainController = mainController;
    }

    public static void loadView(String fxml) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        mainController.setView((Pane) loader.load(
                MenuNavigator.class.getResource(fxml
                )));
    }

}
