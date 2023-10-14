import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class CircleColorChangeApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a Circle with an initial fill color
        Circle circle = new Circle(100, 100, 50);
        circle.setFill(Color.WHITE);

        // Add event handlers for mouse pressed and released events
        circle.setOnMousePressed(event -> circle.setFill(Color.BLACK));
        circle.setOnMouseReleased(event -> circle.setFill(Color.WHITE));

        StackPane root = new StackPane();
        root.getChildren().add(circle);

        Scene scene = new Scene(root, 300, 200);

        primaryStage.setTitle("Change Color with Mouse");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
