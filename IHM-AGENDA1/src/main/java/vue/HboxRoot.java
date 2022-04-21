package vue;

import controler.Controler;
import javafx.scene.layout.HBox;

public class HboxRoot extends HBox {
    public HboxRoot(){
        private static Controleur controleur = new Controler();
        private static VBoxCalendrier calendrierPane = new VBoxCalendrier();
        private static  ;
        private static calendrierPane;
        private static reservationPane;

        GridPaneFormulaireReservation GridPaneFormulaire = new GridPaneFormulaireReservation();
        VBoxRootTilePane Calendrier = new VBoxRootTilePane();
        getChildren().add(GridPaneFormulaire);


    }
}
