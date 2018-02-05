import controller.MainMenuController;
import controller.MenuNavigator;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Planetering");
        //primaryStage.setFullScreen(true);
        primaryStage.setScene(createScene(loadMainPane()));
        primaryStage.show();
    }

    private BorderPane loadMainPane() throws IOException {
        FXMLLoader loader = new FXMLLoader();

        BorderPane mainPane = (BorderPane) loader.load(getClass().getResourceAsStream(MenuNavigator.MAINMENU));

        MainMenuController mainController = new MainMenuController();

        MenuNavigator.setMainController(mainController);
        return mainPane;
    }

    private Scene createScene(BorderPane mainPane) {
        Scene scene = new Scene(
                mainPane
        );
        return scene;
    }


}
