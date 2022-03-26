package sk.llpc.model;

import java.util.LinkedList;

public class Cassa

{

    private LinkedList<Carrello> coda;
    private boolean aperta;
    private final int velocità = 15;

    /**
     * Operation Cassa
     * Costruttore vuoto, crea la LinkedList, mette la cassa aperta.
     *
     * @return 
     */
    public Cassa (  ){}

    /**
     * Operation aggiungiCarrello
     * Aggiunge un carrello alla cassa.
     *
     * @param c - 
     */
    public void aggiungiCarrello ( Carrello c ){}


    /**
     * Operation aggiorna
     * Processa il carrello.
     *
     */
    public void aggiorna (  ){}


    /**
     * Operation apri
     *
     */
    public void apri (  ){}


    /**
     * Operation chiudi
     *
     */
    public void chiudi (  ){}


    /**
     * Operation getQuanti
     *
     * @return int
     */
    public int getQuanti (  ){
        return 0;
    }


    /**
     * Operation isOpen
     * Ritorna false se è chiusa.
     *
     * @return boolean
     */
    public boolean isOpen (  ){
        return true;
    }
}

