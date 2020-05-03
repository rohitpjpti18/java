package com.hibernatpractice;

/**
 * Hello world!
 *
 */

import com.hibernatpractice.Message;

public class App 
{
    public static void main( String[] args )
    {
        UserTransaction tx = TM.getUserTransaction();
        tx.begin();

        EntityManager em = emf.createEntityManager();
        Message message = new Message();

        em.persist();
        tx.commit();

        em.close();
    }
}
