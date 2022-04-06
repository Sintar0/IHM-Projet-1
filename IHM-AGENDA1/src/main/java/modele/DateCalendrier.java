package modele;
import java.util.Calendar;
public class DateCalendrier extends Date implements ConstantesCalendrier, Comparable <Date>{
    private int chJourSem;
    private int chNoSem;

    public DateCalendrier(){
        Calendar today = Calendar.getInstance();
        chAnnee = today.get(Calendar.YEAR);
        chMois = today.get(Calendar.MONTH) + 1;
        chJourSem = today.get(Calendar.DAY_OF_WEEK);
        chJour = today.get(Calendar.DAY_OF_MONTH);
        chNoSem = today.get(Calendar.WEEK_OF_YEAR);
        if (chJourSem == Calendar.SUNDAY)
            chJourSem = 7;
        else 
            chJourSem --;
    }

    public DateCalendrier(int parJour,int parMois,int parAnnee){
        super(parJour, parMois, parAnnee);
        Calendar date = Calendar.getInstance();
        date.set(parAnnee,parMois-1,parJour);
        chJourSem = date.get(Calendar.DAY_OF_WEEK);
        chNoSem = date.get(Calendar.WEEK_OF_YEAR);
        if (chJourSem == Calendar.SUNDAY)
            chJourSem = 7;
        else
            chJourSem --;
    }

    public int getNoSem(){
        return chNoSem;
    }

    public int getJourSemaine(){
        return chJourSem;
    }

    public int getMois(){
        return chMois;
    }

    public int getAnnee(){
        return chAnnee;
    }
    public int getJour(){return chJour;}
    public String toString(){

        return  ConstantesCalendrier.JOURS_SEMAINE[chJourSem-1] + " " + super.toString();
    }
    /*public int isToday(){
        Date = new date
        super.compareTo(24, 03, 2022)

    }*/

  
    public DateCalendrier dateDuLendemain(){
        Date date = super.dateLendemain();
        return new DateCalendrier(date.chJour, date.chMois, date.chAnnee);
    }
    public DateCalendrier dateDeLaVeille(){
        Date date = super.dateVeille();
        return new DateCalendrier(date.chJour, date.chMois, date.chAnnee);
    }
}