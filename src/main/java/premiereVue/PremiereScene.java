        package premiereVue;

        import javafx.application.Application;
        import javafx.scene.Scene;
        import javafx.scene.layout.VBox;
        import javafx.stage.Stage;

        public class PremiereScene extends Application {
            public void start (Stage stage){
                VBox root = new VBox();
                Scene scene = new Scene(root,300, 80);
                stage.setScene(scene);
                stage.setTitle("Tu es un ingénieur informaticien");
                stage.show();
            }
            public static void main(String [] args){
            Application.launch();
            }
        }
