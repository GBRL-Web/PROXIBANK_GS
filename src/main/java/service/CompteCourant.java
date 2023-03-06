package service;

public class CompteCourant extends Compte {
    String cardType;
    static String[] card = {"Visa Electron", "Visa Premier"};
    float decouvertMax = 1000;

    public CompteCourant(String cardType, float solde) {
        super(solde);
        this.cardType = cardType;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public float getDecouvertMax() {
        return decouvertMax;
    }

    public void setDecouvertMax(float decouvertMax) {
        this.decouvertMax = decouvertMax;
    }

    public float getSolde() {
        return super.getSolde();
    }
    public void transfer(Compte compteCible, float cash) {
        if (cash <= getDecouvertMax()) {
           compteCible.virement(cash);
        }
    }
}
