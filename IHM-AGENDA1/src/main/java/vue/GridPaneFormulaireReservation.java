package vue;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import modele.*;

public class GridPaneFormulaireReservation extends GridPane implements modele.ConstantesCalendrier {
    TextField tfCours = new TextField();// zone de texte
    ToggleGroup toggle = new ToggleGroup();
    ComboBox<Integer> chDebHeure = new ComboBox<>(),
            chDebMin = new ComboBox<>(),
            chFinHeure = new ComboBox<>(),
            chFinMin = new ComboBox<>();
    Button annuler = new Button("Annuler");
    Button save = new Button("Enregistrer");
    DateCalendrier todayDate = new DateCalendrier();
    Label labDate ;

    public GridPaneFormulaireReservation() {

        labDate = new Label(JOURS_SEMAINE[todayDate.getJourSemaine() - 1] + " " + todayDate.getJour() + " " + MOIS[todayDate.getMois() - 1]);
        //labDate.setText("1111");
        int ligne = 0;
        GridPane.setHalignment(labDate, HPos.CENTER);
        this.setHgap(20);
        this.setVgap(10);

        this.add(labDate, 0, 0, 5, 1); // date
        this.add(new Label("Cours"), 0, 2); // cour
        this.add(tfCours, 1, 2, 4, 1);

        Label Niveau = new Label("Niveau");
        this.add(new Label("Niveau"), 0, 3); // champs niveau
        RadioButton débutant = new RadioButton("Débutant");
        RadioButton moyen = new RadioButton("Moyen");
        RadioButton avancé = new RadioButton("Avancé");
        RadioButton expert = new RadioButton("Expert");
        this.add(débutant, 1, 3);
        this.add(moyen, 2, 3);
        this.add(avancé, 1, 5);
        this.add(expert, 2, 5);

        this.add(new Label("début"), 0, 7);
        this.add(new Label("h"), 2, 7);
        this.add(new Label("h"), 2, 8);

        for (int i = 1; i < 25; i++) {
            chDebHeure.getItems().add(i);
            chFinHeure.getItems().add(i);
        }

        for (int i = 0; i < 60; i += 5) {
            chDebMin.getItems().add(i);
            chFinMin.getItems().add(i);
        }

        this.add(chDebHeure, 1, 7);
        this.add(chDebMin, 3, 7);
        this.add(chFinHeure, 1, 8);
        this.add(chFinMin, 3, 8);

        this.add(new Label("min"), 4, 7);
        this.add(new Label("min"), 4, 8);

        this.add(annuler, 0, 25);
        this.add(save, 1, 25);

       /* save.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println(getReserv());
            }
        });*/

        save.setOnAction(HboxRoot.getControleur());
    }

    public Reservation getReserv(){
        int debH = chDebHeure.getSelectionModel().getSelectedItem();
        int debM = chDebMin.getSelectionModel().getSelectedItem();
        int finH = chFinHeure.getSelectionModel().getSelectedItem();
        int finM = chFinMin.getSelectionModel().getSelectedItem();

        String titre = tfCours.getText();

        Reservation r = new Reservation(titre, todayDate, new PlageHoraire(new Horaire(debH, debM), new Horaire(finH, finM)) );
        return r;


    }

    public void setDate(DateCalendrier parDate){
        System.out.println("setDate");
        todayDate = parDate;
        labDate.setText("bbbb");

        System.out.println("setdate " + labDate.getText());
    }
}