package vue;

import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;

import modele.Date;
import modele.DateCalendrier;
import modele.Reservation;

import java.util.TreeSet;

public class VBoxAffichagePlanning extends VBox {
    TextArea taReserv = new TextArea();

    public VBoxAffichagePlanning() {
        super();
        DateCalendrier today = new DateCalendrier();

        Label noSem = new Label("Semaine" + " " + today.getNoSem());



        //taReserv.setAccessibleText(setUserData());

        getChildren().addAll(noSem, taReserv);
    }

    public void setNoSem(DateCalendrier parDate){
        return Label setNoSem = new Label(parDate.getNoSem())  ;

    }

    public void setTextArea(TreeSet<Reservation> parReserv) {
        String str = "";
        for (Reservation reserv : parReserv)
            str += reserv.toString() + "\n";
        taReserv.setTextArea();

    }

}
