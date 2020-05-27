package com.houston;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.transaction.UserTransaction;

/**
 * Unit test for simple App.
 */
class AppTest {

    @Test
    void testApp() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HelloWorldPU");

        UserTransaction tx = TM.getUserTransaction();
        tx.begin();

        En
    }
}
