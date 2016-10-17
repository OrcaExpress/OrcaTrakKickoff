package com.orcaexpress.orcatrak.entity;

import com.orcaexpress.orcatrak.eum.AccountStatus;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table(name = "USERS")
public class User implements Serializable {

    @Id
    @Column(name = "ID", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "BUSINESS_NAME")
    private String businessName;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "PHONE")
    private String phone;

    @Column(name = "CELL_PHONE")
    private String cellPhone;

    @Column(name = "FAX")
    private String fax;

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "streetAddress", column = @Column(name = "STREET_ADDRESS_BUSINESS")),
        @AttributeOverride(name = "city", column = @Column(name = "CITY_BUSINESS")),
        @AttributeOverride(name = "state", column = @Column(name = "STATE_BUSINESS")),
        @AttributeOverride(name = "zipCode", column = @Column(name = "ZIPCODE_BUSINESS")),
        @AttributeOverride(name = "country", column = @Column(name = "COUNTRY_BUSINESS"))
    })
    private Address businessAddress;

    // Credit card billing address must match this address    
    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "streetAddress", column = @Column(name = "STREET_ADDRESS_BILLING")),
        @AttributeOverride(name = "city", column = @Column(name = "CITY_BILLING")),
        @AttributeOverride(name = "state", column = @Column(name = "STATE_BILLING")),
        @AttributeOverride(name = "zipCode", column = @Column(name = "ZIPCODE_BILLING")),
        @AttributeOverride(name = "country", column = @Column(name = "COUNTRY_BILLING"))
    })
    private Address billingAddress;

    @Column(name = "ACCOUNT_OPEN_DATE")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date accountOpenDate;

    @Column(name = "ACCOUNT_STATUS")
    @Enumerated(EnumType.STRING)
    private AccountStatus accountStatus;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user", orphanRemoval = true, fetch = FetchType.LAZY)
    private List<Quote> quotes = new ArrayList<>();
    
    @Column(name = "BALANCE")
    private Double balance;

    //@ManyToOne(cascasde = CascadeType.All, mappedBy = "user", orphanRemoval = true, fetch = FetchType.LAZY)
    //private Set<Quote> orders = new HashSet<>();

    public User() {
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

    public Address getBusinessAddress() {
        return businessAddress;
    }

    public void setBusinessAddress(Address businessAddress) {
        this.businessAddress = businessAddress;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    public Date getAccountOpenDate() {
        return accountOpenDate;
    }

    public void setAccountOpenDate(Date accountOpenDate) {
        this.accountOpenDate = accountOpenDate;
    }

    public AccountStatus getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(AccountStatus accountStatus) {
        this.accountStatus = accountStatus;
    }

    public List<Quote> getQuotes() {
        return quotes;
    }

    public void setQuotes(List<Quote> quotes) {
        this.quotes = quotes;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}
