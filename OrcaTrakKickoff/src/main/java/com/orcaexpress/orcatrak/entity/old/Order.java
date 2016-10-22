package com.orcaexpress.orcatrak.entity.old;

import com.orcaexpress.orcatrak.Validators.AccountQualifier;
import com.orcaexpress.orcatrak.helper.Archived;
import com.orcaexpress.orcatrak.helper.Delivery;
import com.orcaexpress.orcatrak.helper.Payment;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import org.slf4j.LoggerFactory;

//@Entity
//@Table(name = "ORDERS")
//@AccountQualifier(groups = Archived.class)
public class Order extends Quote implements Serializable {
    
   // private final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(this.getClass());
/*
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JoinColumn
    @ManyToOne(cascade = CascadeType.ALL)
    private User shipper;

    @JoinColumn
    @ManyToOne(cascade = CascadeType.ALL)
    private User receiver;

    @Column(name = "MEMO", length = 5000)
    private String memo;

    //account holder is the user who logged into the system
    @JoinColumn
    @ManyToOne(cascade = CascadeType.ALL)
    private User accountHolder;

    @Column(name = "PAYMENT_DATE", nullable = false)
    //@Temporal(javax.persistence.TemporalType.DATE)
    @NotNull(groups = Payment.class)
    @Past(groups = Payment.class)
    private Double paymentDate;

    // what date is the product being delivered at 
    @Column(name = "DELIVERY_DATE", nullable = false)
    //@Temporal(javax.persistence.TemporalType.DATE)
    @NotNull(groups = Delivery.class)
    @Past(groups = Delivery.class)
    private Date deliveryDate;

//  remove lines below super() if the validator @AccountQualifier(groups = Archived.class) works 
//    public Order() {
//        super();
//        if (isAccountInGoodStanding(currentUser -> currentUser.getAccountStatus().equals(AccountStatus.LOCKED))) {
//            LOGGER.debug("account is locked please contact agent");
//        }
//    }
//
//    private boolean isAccountInGoodStanding(Exemptable ex) {
//        return ex.isExempt(accountHolder);
//    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getShipper() {
        return shipper;
    }

    public void setShipper(User shipper) {
        this.shipper = shipper;
    }

    public User getReceiver() {
        return receiver;
    }

    public void setReceiver(User receiver) {
        this.receiver = receiver;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public User getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(User accountHolder) {
        this.accountHolder = accountHolder;
    }

    public Double getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Double paymentDate) {
        this.paymentDate = paymentDate;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }
*/
}
