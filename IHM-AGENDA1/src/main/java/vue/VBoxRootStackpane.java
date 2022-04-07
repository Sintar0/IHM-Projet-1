/*
/*
package vue;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import modele.CalendrierDuMois;
import modele.ConstantesCalendrier;
import modele.Date;
import modele.DateCalendrier;

import java.util.List;

public class VBoxRootStackpane extends VBox implements ConstantesCalendrier {
    public VBoxRootStackpane() {
        super();
        DateCalendrier todayDate = new DateCalendrier();
        HBox datemois = new HBox();
        HBox cLickclick = new HBox();
        Label labelTitre = new Label(MOIS[todayDate.getMois()-1]+ " " + todayDate.getAnnee());
        Button prev = new Button("<");
        Button next = new Button(">");
        Button start = new Button("<<");
        Button end = new Button(">>");

        cLickclick.getChildren().addAll(start, prev, next, end);
        datemois.getChildren().add(labelTitre);


        StackPane stackMois = new StackPane();

        for(int mois=0; mois<12 ;mois++) {
            CalendrierDuMois monthCalendar2 = new CalendrierDuMois(1+mois, 2022);

            ScrollPane scrollPaneDates = new ScrollPane();
            VBox boiteDates = new VBox();
            scrollPaneDates.setContent(boiteDates);
            for (DateCalendrier date : monthCalendar2.getDates()) {
                Label labelDate = new Label(date.toString());
                if (date.getMois() != monthCalendar2.getMois()) {
                    labelDate.setId("dateHorsMois");
                }
                if (date.compareTo(todayDate) == 0) {
                    labelDate.setId("today");
                }
                VBox.setMargin(labelDate, new Insets(8));
                boiteDates.getChildren().add(labelDate);


            }
            scrollPaneDates.setAccessibleText(MOIS[mois]);
            stackMois.getChildren().add(scrollPaneDates);

        }
        List<Node> listDates = stackMois.getChildren();
        prev.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                listDates.get(listDates.size()-1).toBack();
                labelTitre.setText(listDates.get(11).getAccessibleText());
            }

        });
        next.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                listDates.get(0).toFront();
                labelTitre.setText(listDates.get(11).getAccessibleText());
            }
        });
        start.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                while (!listDates.get(listDates.size()-1).getAccessibleText().equals(MOIS[0]))
                    listDates.get(listDates.size()-1).toBack();
                    labelTitre.setText(listDates.get(11).getAccessibleText());
            }
        });
        end.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                while (!listDates.get(listDates.size()-1).getAccessibleText().equals(MOIS[11]))
                    listDates.get(0).toFront();
                    labelTitre.setText(listDates.get(11).getAccessibleText());

            }
        });


        this.getChildren().addAll(cLickclick,datemois,stackMois);
    }


}

 */
/*
















        /*CalendrierDuMois monthCalendar = new CalendrierDuMois(3,2022);
        System.out.println( monthCalendar);
        DateCalendrier todaydate = new DateCalendrier();
        StackPane stackPaneMois = new StackPane();
        Label labelTitle = new Label(MOIS[monthCalendar.getMois()]+" "+monthCalendar.getAnnee());
        VBox.setMargin(labelTitle,new Insets(14));
        VBox boiteDates = new VBox();
        ScrollPane scrollPaneDates = new ScrollPane();
        scrollPaneDates.setContent(boiteDates);
        VBox.setMargin(scrollPaneDates,new Insets(4));
        for (DateCalendrier date : monthCalendar.getDates()){
            Label labelDate = new Label(date.toString());
            if(date.getMois()!=monthCalendar.getMois()){
                labelDate.setId("dateHorsMois");
            }
            if(date.compareTo(todaydate)==0){
                labelDate.setId("today");
            }
            VBox.setMargin(labelDate,new Insets(8));
            boiteDates.getChildren().add(labelDate);


        }
        getChildren().addAll(labelTitle,scrollPaneDates);













        /*super (10);
        DateCalendrier date = new DateCalendrier();
        int mois= date.getMois();
        int an = date.getAnnee();
        int jour = date.getJour();
        Label labMois = new Label(jour+"/"+mois +"/"+an);
        getChildren().add(labMois);
        Label labscroll = new Label(date.toString());
        VBox boxdate = new VBox();
        ScrollPane scrollPaneDates = new ScrollPane();
        scrollPaneDates.setContent(boxdate);
        boxdate.getChildren().add(labscroll);
        boxdate.getChildren().add(scrollPaneDates);

    }

}
*/
