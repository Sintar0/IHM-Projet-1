package premiereVue; /* importation du package premiereVue, rappel : il continent la méthode main pour lancer l'app*/
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.File;


public class PremiereScene extends Application {
    public void start(Stage stage) {
        VBox root = new VBox(); /* Vbox est un composant donc appartient à root */
        Scene scene = new Scene(root,900,200); /*scene appartient à Scene, mais composant scene = root */
        stage.setScene(scene); /* associe l'élément à la fêntre */
        stage.setTitle("Je reprends doucement mon TP d'IHM");
        stage.show();

    }
}