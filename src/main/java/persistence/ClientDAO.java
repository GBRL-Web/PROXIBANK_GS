package persistence;

import service.Client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ClientDAO {
    public ClientDAO() {
    }

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
    EntityManager em = emf.createEntityManager();
    EntityTransaction txn = em.getTransaction();

    public void create(Client client) {
        try {
            txn.begin();
            em.persist(client);
            System.out.println("créer");

            txn.commit();
        } catch (Exception e) {
            if (txn != null) {
                txn.rollback();
            }
            e.printStackTrace();
        } finally {
            if (em != null) {
                em.close();
            }
            if (emf != null) {
                emf.close();
            }
        }

    }

    public void delete(int id) {
        try {
            txn.begin();
            Client client = em.find(Client.class, id);
            em.remove(client);
            System.out.println(client);
            txn.commit();
        } catch (Exception e) {
            if (txn != null) {
                txn.rollback();
            }
            e.printStackTrace();
        } finally {
            if (em != null) {
                em.close();
            }
            if (emf != null) {
                emf.close();
            }
        }

    }

    public void update(Client client) {
        try {
            txn.begin();
            em.merge(client);
            System.out.println("Le client a été modifié avec succès");
            txn.commit();
        } catch (Exception e) {
            if (txn != null) {
                txn.rollback();
            }
            e.printStackTrace();
        } finally {
            if (em != null) {
                em.close();
            }
            if (emf != null) {
                emf.close();
            }
        }


    }

    public Client read(int id) {
        Client clientFind = null;
        try {
            txn.begin();
            clientFind = em.find(Client.class, id);
            System.out.println(clientFind);

            txn.commit();

        } catch (Exception e) {
            if (txn != null) {
                txn.rollback();
            }
            e.printStackTrace();
        } finally {
            if (em != null) {
                em.close();
            }
            if (emf != null) {
                emf.close();
            }

        }

        return clientFind;
    }
}




