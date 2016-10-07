package com.orcaexpress.orcatrak.entity;

import java.io.Serializable;
import java.util.Date;

/**
 
 * Now, a user can have multiple quotes, so a many-to-one defined in Quote will
 * be nice. We will see if one-to-many is User is necesary or not in the future.
 *
 */
public class User implements Serializable {

    private Long id;
    private String firstName;
    private String lastName;
    private String businessName;
    private String email;
    private String phone;
    private String cellPhone;
    private String fax;
    private Address address;
    private Date startDate;   
    private AccountType accountType; 

    
    public User() {         
    }

    public User(Long id, String firstName, String lastName, String businessName, String email, String phone, String cellPhone, Address address, AccountType accountType) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.businessName = businessName;
        this.email = email;
        this.phone = phone;
        this.cellPhone = cellPhone;
        this.address = address;
        this.accountType = accountType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }
}
