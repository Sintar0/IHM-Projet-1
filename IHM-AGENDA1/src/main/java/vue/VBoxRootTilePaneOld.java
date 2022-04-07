
package vue;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
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
        DateCalendrier todayDate = new DateCalendrier();

        HBox datemois = new HBox();
        HBox cLickclick = new HBox();
        Label labelTitre = new Label(MOIS[todayDate.getMois()-1]+ " " + todayDate.getAnnee());
        Button prev = new Button("<");
        Button next = new Button(">");
        Button start = new Button("<<");
        Button end = new Button(">>");

        cLickclick.getChildren().addAll(start, prev, next, end);
        datemois.getChildren().add(labelTitre);



        for (int i = 1; i <= 12; i++) {
            CalendrierDuMois mouthCalendar = new CalendrierDuMois(i, 2022);
            //
            TilePane tilePane = new TilePane();
            tilePane.setPrefColumns(7);
            //
            tilePane.setMaxWidth(210);
            tilePane.setMinWidth(210);
            //
            tilePane.setId("opaque");
            //
            for (String jourAb : JOUR_ABJ) {
                Label labelJour = new Label(jourAb);
                tilePane.getChildren().add(labelJour);
            }
            for (DateCalendrier date : mouthCalendar.getDates()) {
                Label labelDate = new Label(date.toString());
                if (date.getMois() != mouthCalendar.getMois()) {
                labelDate.setId("dateHorsMois");
                }
                if (date.compareTo(todayDate) == 0) {
                labelDate.setId("today");
                }
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
                    labelTitre.setId("today");
                }

            }
            tilePane.setAccessibleText(MOIS[i - 1]);
            stackPaneMois.getChildren().add(tilePane);

        }
        List<Node> listDates = stackPaneMois.getChildren();
        prev.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                listDates.get(listDates.size()-1).toBack();
                labelTitre.setText(listDates.get(11).getAccessibleText());
            }

        });
        next.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                listDates.get(0).toFront();
                labelTitre.setText(listDates.get(11).getAccessibleText());
            }
        });
        start.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                while (!listDates.get(listDates.size()-1).getAccessibleText().equals(MOIS[0]))
                    listDates.get(listDates.size()-1).toBack();
                labelTitre.setText(listDates.get(11).getAccessibleText());
            }
        });
        end.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                while (!listDates.get(listDates.size()-1).getAccessibleText().equals(MOIS[11]))
                    listDates.get(0).toFront();
                labelTitre.setText(listDates.get(11).getAccessibleText());

            }
        });

        DateCalendrier today = new DateCalendrier();
        int indexMois = 12 - today.getMois();

        for(int i = indexMois; i != 0; i--){
            listDates.get(listDates.size() - 1).toBack();
        }

        getChildren().addAll(stackPaneMois, cLickclick,datemois);

    }
}
