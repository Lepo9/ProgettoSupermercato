package sk.llpc.model;

import java.util.Random;

public class Carrello {
    private int nProdotti;

    public Carrello(){
        this.nProdotti = (int)(Math.random()*40)+ 10;
    }

    /**
     * Operation removeProduct
     * Ritorna false se il carrello è vuoto.
     *
     * @paramn nProducts - Prodotti contenuti nel carrello
     * @param nProdotti - parametro che indica quanti elementi devo essere estratti dal carrello
     * @return boolean false se il carrello è vuoto
     */

    public boolean togliProdotti(int nProdotti){
        this.nProdotti -= nProdotti;

        if (this.nProdotti <= 0){
            return false;
        }
        else
            return true;
    }
}


