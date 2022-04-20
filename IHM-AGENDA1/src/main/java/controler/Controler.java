
package controler;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.ToggleButton;
import vue.GridPaneFormulaireReservation;
import vue.HboxRoot;

public class Controler extends HboxRoot implements EventHandler {
    @Override
    public void handle(Event event) {
        Planning planning = HBoxRoot.getPlanning();
        GridPaneFormulaireReservation reservationPane = HBoxRoot.getReservationPane();
// la source de event est une date du calendrier du formulaire de réservation
        if (event.getSource() instanceof ToggleButton) {
// à compléter
        }
// la source de event est le bouton "Enregistrer"
        if (event.getSource() instanceof Button) {
// à compléter
        }
    }
}
