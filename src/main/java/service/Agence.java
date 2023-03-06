package service;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;
//import java.util.ArrayList;
//import java.util.List;
@Entity
public class Agence {
   @Id
   @GeneratedValue
    int id;
    LocalDate dateCreation;
    //List<Conseiller> listeConseiller = new ArrayList<>();
    public Agence() {
        dateCreation = LocalDate.now();
    }

//    public void addConseiller(Conseiller conseiller) {
//        if (listeConseiller.contains(counselor)) {
//            System.out.println("This counselor already works here.");
//        } else {
//            counselorList.add(counselor);
//        }
//    }

}
