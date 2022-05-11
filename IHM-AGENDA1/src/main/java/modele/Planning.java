package modele;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Planning {

        private Map<Integer, Set<Reservation>> chTreeMapReservations ;

        public Planning() {
            chTreeMapReservations = new TreeMap<>();
        }

        /**  à compléter
         *
         *
         *
         */
        public boolean ajout (Reservation parReservation)   {

            int numSemaine = ((DateCalendrier)parReservation.getDate()).getJourSemaine();
            Set <Reservation> set = chTreeMapReservations.get(numSemaine);
            if (set==null) {
                set = new TreeSet<>();
                set.add(parReservation);
                chTreeMapReservations.put(numSemaine, set);
            }
            else {
                set.add(parReservation);
            }
            return true;
        }


        /** retourne un ensemble contenant toutes les réservations de la semaine de numero parWeekOfYear
         *
         * @param parWeekOfYear le numéro de la semaine
         * @return le treeSet des réservations de la semaine de numéro parWeekOfYear
         */
        public Set <Reservation> getReservations (int parWeekOfYear) {
            return  chTreeMapReservations.get(parWeekOfYear);
        }

        public String toString() {
            return "treeMap " + chTreeMapReservations.size() + " - "+ chTreeMapReservations + "\n" ;
        }

        public static void main (String [] args){
            Planning p = new Planning();
            p.ajout(new Reservation("111",new DateCalendrier(),new PlageHoraire(new Horaire(2,0), new Horaire(3,0))));
            p.ajout(new Reservation("222",new DateCalendrier(1,2,2022),new PlageHoraire(new Horaire(2,0), new Horaire(3,0))));
            p.ajout(new Reservation("333",new DateCalendrier(20,1,2022),new PlageHoraire(new Horaire(2,0), new Horaire(3,0))));
            System.out.println(p);
        }
    }

