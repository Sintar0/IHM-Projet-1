package vue;

import controler.Controler;
import javafx.scene.layout.HBox;
import modele.Planning;

public class HboxRoot extends HBox {
    private static Controler controleur = new Controler();
    private static VBoxCalendrier calendrierPane = new VBoxCalendrier();
    private static GridPaneFormulaireReservation formPane = new GridPaneFormulaireReservation();
    private static Planning planning = new Planning();
    private static VBoxAffichagePlanning affichagePlanning = new VBoxAffichagePlanning();
    public HboxRoot(){
        //VBoxCalendrier Calendrier = new VBoxCalendrier();
        getChildren().addAll(calendrierPane, formPane, affichagePlanning);

    }
    public static GridPaneFormulaireReservation getFormPane(){
        return formPane;
    }
    public static Controler getControleur(){
        return controleur;
    }
    public static Planning getPlanning(){
        return planning;
    }
    public static VBoxCalendrier getCalendrier(){
        return calendrierPane;
    }

}
