package sk.llpc.model;

import java.util.Random;

public class Carrello {
    private int nProdotti;

    public Carrello(){
        this.nProdotti = (int)(Math.random()*40)+ 10;
    }

    /**
     * Ritorna false se il carrello è vuoto.
     * @param nProdotti - parametro che indica quanti elementi devono essere estratti dal carrello.
     * @return boolean false se il carrello è vuoto.
     */
    public boolean togliProdotti(int nProdotti){
        this.nProdotti--;
        if (this.nProdotti <= 0){
            return false;
        }
        else
            return true;
    }
}


