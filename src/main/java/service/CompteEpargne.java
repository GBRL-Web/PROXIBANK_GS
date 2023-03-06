package service;

public class CompteEpargne extends Compte {
    int tauxInteret = 3;

    public CompteEpargne(float solde){
        super(solde);
    }

    public int getTauxInteret() {
        return tauxInteret;
    }

    public void setTauxInteret(int tauxInteret) {
        this.tauxInteret = tauxInteret;
    }

}
