package com.orcaexpress.orcatrak.boundary;

import com.orcaexpress.orcatrak.entity.Dummy;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.slf4j.LoggerFactory;

/**
 *
 * @author OrcaExpress
 */
@Stateless
public class DummyService {

    private final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @PersistenceContext(unitName = "persistenceUnit")
    private EntityManager em;
     
    public void persist(Dummy dummy) {
        try {
            em.persist(dummy);
            LOGGER.debug("I've successfully saved a dummy with text:" + dummy.getText());
        } catch (Exception e) {
            LOGGER.debug("Error: " + e);
            throw new RuntimeException(e);
        }
    }

    public List<String> getAllDummies() {

        try {
            LOGGER.debug("Get all dummies ...");
            return em.createNativeQuery("SELECT d.text FROM dummy d").getResultList();
        } catch (Exception e) {
            LOGGER.debug("Error: " + e);
            throw new RuntimeException(e);
        }
    }

}
