package service;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;
@Entity
public class Compte {

   @Id
   @GeneratedValue
    private int id;
    private float solde=0;
    LocalDate dateCreation;

    public Compte(float solde) {
        this.solde = solde;
        this.dateCreation = LocalDate.now();
    }

    public int getId() {
        return id;
    }

    public float getSolde() {
        return solde;
    }

    public void retrait(float montant) {
        this.solde -= montant;
    }

    public void virement(float montant) {
        this.solde += montant;
    }
    public void transfer(Compte compteCible, float montant) {
    }
}
