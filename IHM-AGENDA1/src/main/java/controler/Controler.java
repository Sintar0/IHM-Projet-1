
package controler;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.ToggleButton;
import modele.DateCalendrier;
import modele.Planning;
import modele.Reservation;
import vue.GridPaneFormulaireReservation;
import vue.HboxRoot;

public class Controler extends GridPaneFormulaireReservation implements EventHandler  {
    @Override
    public void handle(Event event) {
        Planning planning = HboxRoot.getPlanning();
        GridPaneFormulaireReservation reservationPane = HboxRoot.getFormPane();
// la source de event est une date du calendrier du formulaire de réservation
        if (event.getSource() instanceof ToggleButton) {
            DateCalendrier date = (DateCalendrier) ((ToggleButton) event.getSource()).getUserData();
            System.out.println(date.toString());
            reservationPane.setDate(date);
        }
// la source de event est le bouton "Enregistrer"
        if (event.getSource() instanceof Button) {
            Reservation r = reservationPane.getReserv();
            planning.ajout(r);
            System.out.println(planning);
        }
    }

}
