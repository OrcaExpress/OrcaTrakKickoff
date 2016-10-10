package com.orcaexpress.orcatrak.control;

import com.orcaexpress.orcatrak.boundary.UserService;
import static com.orcaexpress.orcatrak.eum.AccountTypeStatus.NET0;
import com.orcaexpress.orcatrak.entity.Address;
import com.orcaexpress.orcatrak.entity.User;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author OrcaExpress
 */
@Named
@RequestScoped
public class UserBean {

    private User user;

    @EJB
    private UserService userService;

    @PostConstruct
    public void init() {
        user = new User();
    }

    public void saveUserAction() {

        // Obviously, these info should come from a <h:form/>
        user.setFirstName("jack");
        user.setLastName("mccoy");
        user.setBusinessName("universal hauling");
        user.setEmail("jack@universalhauling.com");
        user.setPhone("2148029284");
        user.setCellPhone("2147800522");
        user.setBusinessAddress(new Address("4831 top line", "dallas", "tx", "75247"));
        user.setBillingAddress(new Address("4641 production drv unit #50 line", "dallas", "tx", "75235"));
        user.setAccountType(NET0);

        userService.saveUser(user);
    }

    // getters and setters
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
