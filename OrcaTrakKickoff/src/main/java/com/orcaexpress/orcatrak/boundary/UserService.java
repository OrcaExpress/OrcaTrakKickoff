package com.orcaexpress.orcatrak.boundary;

import com.orcaexpress.orcatrak.entity.User;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.slf4j.LoggerFactory;

/**
 *
 * @author OrcaExpress
 */
@Stateless
public class UserService {

    private final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @PersistenceContext(unitName = "persistenceUnit")
    private EntityManager em;

    public User findUser(long id) {
        return em.find(User.class, id);
    }

    public void saveUser(User user) {
        if (user.getId() == null) {
            em.persist(user);
            LOGGER.debug("User successfully saved ...");
        }
    }

    public void deleteUser(User user) {
        if (user.getId() != null) {
            em.remove(user);
            LOGGER.debug("User with ID " + user.getId() + " successfully removed ...");
        }
    }
}
