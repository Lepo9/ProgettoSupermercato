package sk.llpc.model;

import java.util.ArrayList;
import java.util.Iterator;

public class Supermercato {

    private ArrayList<Cassa> casse;

    /**
     * Operation Supermercato
     * Crea l'ArreyList e costruzione delle casse.
     *
     * @param nCasse - 
     * @return 
     */
    public Supermercato ( int nCasse ){
        casse = new ArrayList<>();
    }


    /**
     * Operation aggiorna
     * Aggiorna tutte le casse.
     * Si generano da 1 a 4 carrelli accodandoli nelle casse
     *
     */
    public void aggiorna ( ){
    }


    /**
     * Operation ricercaCassaMinore
     *
     * @return Cassa
     */
    private Cassa ricercaCassaMinore (  ){
        int temp = 2000000000;
        Cassa c = new Cassa();
        for (Cassa item:casse) {
            if(temp > item.getQuanti()){
                temp = item.getQuanti();
                c = item;
            }
        }
        return c;
    }

}

