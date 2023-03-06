package presentation;

import persistence.ClientDAO;
import service.Client;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client("joe", "mama", "rue lyon", "45000", "London", "555-222");
        Client client2 = new Client("Mary", "jane", "rue lyon", "45000", "London", "555-223");
        ClientDAO newDao = new ClientDAO();
        //newDao.create(client1);
        //newDao.read(3);
        newDao.delete(3);
    }
}