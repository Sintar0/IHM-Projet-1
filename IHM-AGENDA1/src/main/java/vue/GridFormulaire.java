package vue;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import modele.ConstantesCalendrier;

public class GridFormulaire extends GridPane implements ConstantesCalendrier {
    public GridFormulaire(){

        int ligne = 0;
        GridPane.setHalignment(labDate.Hpos.CENTER); // Insertion de la date au centre
        this.add(labDate,0,ligne ++ 5, 1);
        this.add(new Label("Cours"), 0, ligne, 1, 1); // Cours
        TextField tfCours = new TextField();
        this.add(tfCours, 1, ligne ++, 4, 1);
    }
}
/* Composant à placer dans le GridPane
la date : label HPos.CENTER(O,O,5,1)
(O, 1) (1,1)
cour   [champs]
(0,2) (1,2) (3,2)
Niv   bouton bouton2
      bouton3 bouton4
(O,4) (1,4)    (2,4) (3,4)  (4,4)
debut [champs]   h  [champs] min
(0,5)
Fin
    Boutton Retour et Suivant | HBox, HPos.Right (0,6,5,1)


 */
