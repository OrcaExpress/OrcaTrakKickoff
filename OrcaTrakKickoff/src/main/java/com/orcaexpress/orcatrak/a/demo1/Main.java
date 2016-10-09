package com.orcaexpress.orcatrak.a.demo1;

import static com.orcaexpress.orcatrak.entity.AccountType.*;
import com.orcaexpress.orcatrak.entity.Address;
import com.orcaexpress.orcatrak.entity.User;
import java.sql.SQLException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        System.out.println("\n\n>>> Executing : " + Main.class.toString() + " <<<\n");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistenceUnit");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        UserService service = new UserService(em);

        //creates and persists 
        tx.begin();
        User user = service.createUser("jack", "mccoy", "universal hauling", "jack@universalhauling.com", "2148029284", "2147800522",
                new Address("4831 top line", "dallas", "tx", "75247"), new Address("4641 production drv unit #50 line", "dallas", "tx", "75235"), NET0);
        tx.commit();

        System.out.println("user persisted: " + user);

        em.close();
        emf.close();

    }

}
