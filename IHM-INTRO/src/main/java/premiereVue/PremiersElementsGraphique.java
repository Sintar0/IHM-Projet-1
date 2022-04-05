package premiereVue;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.File;

public class PremiersElementsGraphique extends Application {
    public void start(Stage stage) {
        VBox root = new VBox(10);
        Label LabelHello = new Label("Hello");
        root.getChildren().add(LabelHello);
        Label labelHelloBis = new Label("Hello JAVAFX");
        root.getChildren().add(labelHelloBis);
        Scene scene = new Scene(root, 300, 80);
        File css = new File("css"+ File.separator+"premiersStyles.css");
        scene.getStylesheets().add(css.toURI().toString());
        stage.setScene(scene);
        stage.setTitle("Hello JavaFX");
        stage.show();
    }
}
