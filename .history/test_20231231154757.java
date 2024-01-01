import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MyJavaFXApp extends Application {
    public void start(Stage primaryStage) {
        Button btn = new Button("Click me!");
        btn.setOnAction(e -> System.out.println("Button clicked!"));

        Scene scene = new Scene(btn, 200, 100);
        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX App");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
