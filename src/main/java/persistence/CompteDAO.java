package persistence;

import service.Compte;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CompteDAO {

    public void compteDAO() {}
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
    EntityManager em = emf.createEntityManager();
    EntityTransaction txn = em.getTransaction();
    public void create(Compte compte) {
        try {
            txn.begin();
            em.persist(compte);
            System.out.println("Créer compte");

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
            Compte compte = em.find(Compte.class, id);
            em.remove(compte);
            System.out.println(compte);
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

    public void update(Compte compte) {
        try {
            txn.begin();
            em.merge(compte);
            System.out.println("Le compte a été modifié avec succès");
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

    public Compte read(int id) {
        Compte compteFind = null;
        try {
            txn.begin();
            compteFind = em.find(Compte.class, id);
            System.out.println(compteFind);

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

        return compteFind;
    }
}
