package sk.llpc.model;

import java.util.LinkedList;

/**
 * Classe Cassa:
 * contiene una coda di carrelli.
 */

public class Cassa {
    private LinkedList<Carrello> coda;
    private boolean aperta;
    private final int velocità = 15;

    /**
     * Costruttore vuoto: crea la LinkedList, mette la cassa aperta (True).
     */
    public Cassa (){
        this.coda = new LinkedList<>();
        this.aperta = true;
    }

    /**
     * Aggiunge un carrello alla cassa.
     * @param c Carrello da aggiungere.
     */
    public void aggiungiCarrello (Carrello c){
        if(c == null)
            return;
        coda.add(c);
    }

    /**
     * Processa il carrello.
     */
    public void aggiorna (){
        if(coda.size() == 0)
            return;
        if((coda.peek()).togliProdotti(velocità))
            coda.pop();
    }

    /**
     * Apre la cassa.
     */
    public void apri (){
        this.aperta = true;
    }

    /**
     * Chiude la cassa.
     */
    public void chiudi (){
        this.aperta = false;
    }

    /**
     * @return numero dei carrelli in una Cassa.
     */
    public int getQuanti (){
        return coda.size();
    }

    /**
     * Interroghiamo lo stato della Cassa.
     * @return false se la Cassa è chiusa.
     */
    public boolean isOpen (){
        if(!aperta)
            return false;
        return true;
    }
}

