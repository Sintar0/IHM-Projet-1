package vue;

import javafx.geometry.HPos;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import modele.DateCalendrier;

import static java.util.Calendar.MINUTE;

public class GridPaneFormulaireReservation extends GridPane implements modele.ConstantesCalendrier{
    public GridPaneFormulaireReservation(){
        DateCalendrier todayDate = new DateCalendrier();
        Label labDate = new Label(JOURS_SEMAINE[todayDate.getJourSemaine()-1] + " " + todayDate.getJour() + " " + MOIS[todayDate.getMois()-1]);
        int ligne = 0;
        GridPane.setHalignment(labDate, HPos.CENTER);
        this.setGridLinesVisible(true);
        this.add(labDate,1,ligne++,5,1); // date
        this.add(new Label("Cours"), 0, ligne++,1,1); // cour
        TextField tfCours = new TextField();// zone de texte
        this.add(tfCours, 1,1);

        Label Niveau = new Label("Niveau");
        this.add(new Label("Niveau"), 0, 3); // champs niveau
        RadioButton débutant = new RadioButton("Débutant");
        RadioButton moyen = new RadioButton("Moyen");
        RadioButton avancé = new RadioButton("Avancé");
        RadioButton expert = new RadioButton("Expert");
        this.add(débutant, 1, 3);
        this.add(moyen, ligne++,3);
        this.add(avancé, 1, 5);
        this.add(expert, 2, 5);

        this.add(new Label("horaire"),0,7);
        this.add(new Label("de"),1,7);
        /*
        ComboBox<String> comboHeureDebut;
        comboHeureDebut = peupleComboBox (HEURES);

        ComboBox<String> comboMinuteDebut;
        comboMinuteDebut = peupleComboBox (MINUTES);
        // récupérer les valeurs sélectionnées pour enregister une réservation
        int heureDebut = comboHeureDebut.getSelectionModel().getSelectedIndex()+7;
        int minutedébut = comboMinuteDebut.getSelectionModel().getSelectedIndex()+15;
        // la méthode peupleCombo
        private ComboBox <String> peupleComboBox (String [] strings){
            ComboBox<String> comboBox = new ComboBox<>();
            for(String string : strings){
                comboBox.getItems().add(string);
            }
            return comboBox;

        }

*/
    }
}