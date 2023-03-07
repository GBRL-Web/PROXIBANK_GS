package presentation;

import persistence.ClientDAO;
import persistence.CompteDAO;
import service.Client;
import service.Compte;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client("joe", "mama", "rue lyon", "45000", "London", "555-222");
        Client client2 = new Client("Mary", "jane", "rue lyon", "45000", "London", "555-223");
        Compte compte1 = new Compte(1000);
        Compte compte2 = new Compte(2000);
        ClientDAO newDao = new ClientDAO();
        //newDao.create(client1);
        Client newClient = newDao.read(3);
        newClient.setName("James");
        newDao.update(newClient);

//        newDao.delete(3);
        CompteDAO compteDao = new CompteDAO();

    }
}