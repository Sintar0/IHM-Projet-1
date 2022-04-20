package modele;
public class Reservation implements Comparable<Reservation> {
    private String chTitre;
    private DateCalendrier chDate;
    private PlageHoraire chPH; 



    public Reservation(String parTitre, DateCalendrier parDate, PlageHoraire parPH){
        chTitre = parTitre;
        chDate = parDate;
        chPH = parPH;
    }
    public DateCalendrier getDate(){
        return chDate;
    }

    public String getTitre(){
        return chTitre;
    }

    public int compareTo(Reservation parReserv) {
        if (chDate.compareTo(parReserv.chDate) != 0) 
            return chDate.compareTo(parReserv.chDate);
        return chPH.compareTo(parReserv.chPH);
    }

    public String toString(){
        return "Reservation" +" " + ":" + " " + chTitre + " " + "le" + " " + chDate + "-" + chPH;
    }
    public boolean estValide(){
        if (chDate.estValide() && chPH.plageValide())
            return true;
        return false;
    }  


}