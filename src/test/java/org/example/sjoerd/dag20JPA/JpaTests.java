package org.example.sjoerd.dag20JPA;

import org.junit.jupiter.api.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import org.example.sjoerd.dag20JPA.app.domain.Persoon;

import static org.assertj.core.api.Assertions.assertThat;

public class JpaTests {

    @Test
    void createEntityManagerAndCheckIt () {
        String persistenceUnit = "puJavaTraject";
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory (persistenceUnit);
//        EntityManager entityManager = entityManagerFactory.createEntityManager ();
//        assertThat(entityManager).isNotNull ();

    }

    @Test
    void InsertRowInTablePersoon () {
        String persistenceUnit = "puJavaTraject";
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory (persistenceUnit);
        EntityManager entityManager = entityManagerFactory.createEntityManager ();

        EntityTransaction transaction = entityManager.getTransaction ();
        transaction.begin ();
        for (int i = 0; i < 40; i++) {
            Persoon persoon = new Persoon();
            persoon.setId (i);
            persoon.setNaam ("Joep_" + i);
            persoon.setEmail (persoon.getNaam () + "@org.com");
            entityManager.persist(persoon);
            }
        transaction.commit ();
            entityManager.persist (new Persoon (1, "Cas", "Jos@org.com"));
            entityManager.persist (new Persoon (2, "Jos", "Jos@org.com"));

        Persoon persoon = entityManager.find (Persoon.class, 2);
        System.out.println (persoon);
    }

//    @Test
//    void readARowFromPersoon () {
//        String persistenceUnit = "puJavaTraject";
//        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory (persistenceUnit);
//        EntityManager entityManager = entityManagerFactory.createEntityManager ();
//
//        EntityTransaction transaction = entityManager.getTransaction ();
//
//        entityManager.
//        transaction.begin ();
//        entityManager.persist (new Persoon (1, "Jos", "Jos@org.com"));
//        transaction.commit ();
//
//    }
}
