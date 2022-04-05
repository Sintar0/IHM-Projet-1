package vue;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import modele.CalendrierDuMois;
import modele.DateCalendrier;

import java.io.File;



public class VBoxRoot extends VBox implements modele.ConstantesCalendrier {
    public VBoxRoot(){
        CalendrierDuMois monthCalendar = new CalendrierDuMois(3,2022);
        //System.out.println(monthCalendar);

        Label labelTitre = new Label(MOIS[monthCalendar.getMois()-1]+ " " + monthCalendar.getAnnee());
        VBox.setMargin(labelTitre, new Insets(14));

        VBox boiteDates = new VBox();
        StackPane stackPaneMois = new StackPane();
        stackPaneMois.getChildren().add(boiteDates);
        //VBox.setMargin(scrollPaneDates, new Insets(4));

        for (DateCalendrier date : monthCalendar.getDates()){
            Label labelDate = new Label(date.toString());
            System.out.println(date.toString());
            // Les attributs id sont utilisés dans le CSS
            if (date.getMois() != monthCalendar.getMois()){
                labelDate.setId("dateHorsMois");
            }
           if (date.compareTo(new DateCalendrier()) == 0){
               labelDate.setId("today");
            }
           VBox.setMargin(labelDate, new Insets(8));
           boiteDates.getChildren().add(labelDate);
        }

        getChildren().addAll(labelTitre, stackPaneMois);
    }
}
