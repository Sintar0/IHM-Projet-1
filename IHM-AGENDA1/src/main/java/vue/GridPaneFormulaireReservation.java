package vue;

import javafx.geometry.HPos;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import modele.DateCalendrier;
public class GridPaneFormulaireReservation extends GridPane implements modele.ConstantesCalendrier{
    public GridPaneFormulaireReservation(){
        DateCalendrier todayDate = new DateCalendrier();
        Label labDate = new Label(JOURS_SEMAINE[todayDate.getJourSemaine()-1] + " " + todayDate.getJour() + " " + MOIS[todayDate.getMois()-1]);
        int ligne = 0;
        GridPane.setHalignment(labDate, HPos.CENTER);
        this.add(labDate,0,ligne++,5,1); // date
        this.add(new Label("Cours"), 0, ligne++,1,1); // cour
        TextField tfCours = new TextField();// zone de texte
        this.add(tfCours,0,ligne++,4,1);
        Label Niveau = new Label("Niveau");
        this.add(new Label("Niveau"), 0, ligne++,1,1); // champs niveau
        RadioButton débutant = new RadioButton("Débutant");
        RadioButton moyen = new RadioButton("Moyen");
        RadioButton avancé = new RadioButton("Avancé");
        RadioButton expert = new RadioButton("Expert");
        this.add(débutant, 1, 2);
        this.add(moyen, 3, 2);
        this.add(avancé, 0, ligne++,4,2);
        this.add(expert, 1, ligne++, 4,2);

    }
}