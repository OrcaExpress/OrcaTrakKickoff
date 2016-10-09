package com.orcaexpress.orcatrak.a.demo1;

import com.orcaexpress.orcatrak.entity.AccountType;
import com.orcaexpress.orcatrak.entity.Address;
import com.orcaexpress.orcatrak.entity.User;
import javax.persistence.EntityManager;

class UserService {

    private EntityManager em;

    public UserService(EntityManager em) {
        this.em = em;
    }

    public User createUser(User user) {
        em.persist(user);
        return user;
    }

    public User createUser(String firstName, String lastName, String businessName, String email, String phone, String cellPhone, Address businessAddress, Address billingAddress, AccountType accountType) {
        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setBusinessName(businessName);
        user.setEmail(email);
        user.setPhone(phone);
        user.setCellPhone(cellPhone);
        user.setBusinessAddress(businessAddress);
        user.setBillingAddress(billingAddress);
        user.setAccountType(accountType);
        em.persist(user);
        return user;
    }

    public void removeUser(User user) {
        em.remove(em.merge(user));
    }

//    public void removeUser(Long id) { 
//        User user = em.find(User.class, id);
//        if (user != null) { 
//            em.remove(user);
//        }
//    }
//    
//    public User findUser(Long id) { 
//        return em.find(User.class, id);
//    }
}
