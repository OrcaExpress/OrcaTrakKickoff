package com.orcaexpress.orcatrak.control;

import com.orcaexpress.orcatrak.boundary.UserService;
import static com.orcaexpress.orcatrak.eum.AccountStatus.NET0;
import static com.orcaexpress.orcatrak.eum.AccountStatus.NET30;
import com.orcaexpress.orcatrak.entity.old.Address;
import com.orcaexpress.orcatrak.entity.old.User;
import static com.orcaexpress.orcatrak.eum.AccountStatus.NET0;
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

        user.setFirstName("jack");
        user.setLastName("mccoy");
        user.setBusinessName("universal hauling");
        user.setEmail("jack@universalhauling.com");
        user.setPhone("2148029284");
        user.setCellPhone("2147800522");
        user.setBusinessAddress(new Address("4831 top line", "dallas", "tx", "75247"));
        user.setBillingAddress(new Address("4641 production drv unit #50 line", "dallas", "tx", "75235"));
        user.setAccountStatus(NET0);
        
        userService.saveUser(user);

        user.setFirstName("frank");
        user.setLastName("belajio");
        user.setBusinessName("dre");
        user.setEmail("dre@dre.com");
        user.setPhone("2147800522");
        user.setCellPhone("2146549080");
        user.setBusinessAddress(new Address("4641 production drv", "dallas", "tx", "75235"));
        user.setBillingAddress(new Address("4642 cash st unit #1", "dallas", "tx", "75237"));
        user.setAccountStatus(NET30);
        
        userService.saveUser(user);

        user.setFirstName("charlie");
        user.setLastName("brown");
        user.setBusinessName("brown and assoc");
        user.setEmail("charlie@brown.com");
        user.setPhone("214865484");
        user.setCellPhone("2149873522");
        user.setBusinessAddress(new Address("653 fairmount drv", "dallas", "tx", "75247"));
        user.setBillingAddress(new Address("1 production drv unit #1 line", "dallas", "tx", "75235"));
        user.setAccountStatus(NET0);

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
