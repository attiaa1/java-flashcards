import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("JavaFX App");

        primaryStage.getIcons().add(new Image(Main.class.getResourceAsStream("/resources/icon.png")));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

