package com.orcaexpress.orcatrak.entity;

import com.orcaexpress.orcatrak.helper.Exemptable;
import com.orcaexpress.orcatrak.helper.AccountExemptionHandler;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "ORDERS")
public class Order extends Quote implements Serializable{ 
    
    @Column(name = "MEMO", length = 5000)
    private String memo;
    
    @Transient
    private boolean isAccountInGoodStanding;

    public Order() {
        super();
    }
    
    private boolean isAccountInGoodStanding (User user, Double amount, Exemptable ex, 
            AccountExemptionHandler accountExemptionHandler) { 
        return true;
    }
}
