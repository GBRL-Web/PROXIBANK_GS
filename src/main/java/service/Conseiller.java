package service;

import java.util.ArrayList;
import java.util.List;

public class Conseiller {
    int id;
    List<Client> clients = new ArrayList<>();

    public Conseiller(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
