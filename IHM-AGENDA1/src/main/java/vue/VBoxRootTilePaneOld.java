package vue;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import modele.CalendrierDuMois;
import modele.ConstantesCalendrier;
import modele.DateCalendrier;
import java.util.List;

// Création du nouveau stackPane
public class VBoxRootTilePaneOld extends VBox implements ConstantesCalendrier {
    public VBoxRootTilePaneOld() {
        super();
        StackPane stackPaneMois = new StackPane();
        // Création des bouttons
        ToggleGroup buttonGroup = new ToggleGroup();
        for (int i = 1; i <= 12; i++) {
            CalendrierDuMois mouthCalendar = new CalendrierDuMois(i, 2022);
            //
            TilePane tilePane = new TilePane();
            tilePane.setPrefColumns(7);
            //
            tilePane.setPrefRows(mouthCalendar.getAnnee().size() % 7 + 1);
            //
            tilePane.setId("opaque");
            //
            for (String jourAb : JOURS_SEMAINE) {
                Label labelJour = new Label(jourAb);
                tilePane.getChildren().add(labelJour);
            }
            for (DateCalendrier date : mouthCalendar.getDates()) {
                //
                ToggleButton boutonDate = new ToggleButton(Integer.toString(date.getJour()));
                //
                boutonDate.setToggleGroup(buttonGroup);
                tilePane.getChildren().add(boutonDate);
                //
                boutonDate.setUserData(date);
                //
                boutonDate.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        System.out.println(boutonDate.getUserData().toString());
                    }
                });
                if (date.getMois() != mouthCalendar.getMois()) {
                    boutonDate.setId("dateHorsMois");
                }
                if (date.compareTo(todayDate) == 0) {
                    labelDate.setId("today");
                }
            }
            tilePane.setAccessibleText(MOIS[]);[i - 1]);
            stackPaneMois.getChildren().add(tilePane);
        }
    }
}
