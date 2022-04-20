package vue;

import javafx.scene.layout.HBox;

public class HboxRoot extends HBox {
    public HboxRoot(){
        GridPaneFormulaireReservation GridPaneFormulaire = new GridPaneFormulaireReservation();
        VBoxRootTilePane Calendrier = new VBoxRootTilePane();
        getChildren().add(GridPaneFormulaire);
        /*
        private static controler;
        private static planning ;
        private static calendrierPane;
        private static reservationPane;
        controler();

         */


    }
}
