package com.orcaexpress.orcatrak.entity;

import com.orcaexpress.orcatrak.eum.ZoneStatus;
import com.orcaexpress.orcatrak.eum.AccessoryStatus;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table(name = "QUOTES")
public class Quote implements Serializable {

    @Id
    @Column(name = "ID", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // what zipcode is the product being shipped FROM
    @Column(name = "ORIGIN_ZIP", nullable = false)
    private String originZip;

    // is the pickup address zoned BUSINESS or RESIDENTIAL (extra costs are 
    // associated with residential; trucks weighing more than 22,000kg are
    // not allowed through residential homes)
    @Column(name = "PICKUP_ZONE", nullable = false)
    private ZoneStatus pickupZone;

    // order creation date
    @Column(name = "CREATION_DATE", nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date creationDate;

    // pickup date
    @Column(name = "PICKUP_DATE", nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date pickupDate;

    // ENUM does receiving customer need LIFTGATE, INSIDE_PICKUP, NOTIFY_PRIOR_TO_ARRIVAL
    @Column(name = "PICKUP_REQUIREMENTS")
    @Enumerated(EnumType.STRING)
    private AccessoryStatus pickupRequirements;

    // what zipcode is the product being shipped TO
    @Column(name = "DESTINATION_ZIP", nullable = false)
    private String destinationZip;

    // is the delivery address zoned BUSINESS or RESIDENTIAL (extra costs are 
    // associated with residential; trucks weighing more than 22,000kg are not 
    // allowed through residential homes)
    @Column(name = "DELIVERY_ZONE", nullable = false)
    @Enumerated(EnumType.STRING)
    private ZoneStatus deliveryZone;

    // ENUM does receiving customer need LIFTGATE, INSIDE_PICKUP, NOTIFY_PRIOR_TO_ARRIVAL
    @Column(name = "DELIVERY_REQUIREMENTS")
    @Enumerated(EnumType.STRING)
    private AccessoryStatus deliveryRequirements;

    // price quotation on the delivery
    @Column(name = "QUOTE_PRICE")
    private Double quotePrice;

    // how many items are being quoted for in ONE shipment; more items means higher price
    @JoinColumn
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Item> items = new HashSet<>();

    public Quote() {
    }

    public Quote(Long id, String originZip, ZoneStatus pickupZone, Date pickupDate, AccessoryStatus pickupRequirements, String destinationZip, ZoneStatus deliveryZone, AccessoryStatus deliveryRequirements, Double quotePrice, Set<Item> items) {
        this.id = id;
        this.originZip = originZip;
        this.pickupZone = pickupZone;
        this.pickupDate = pickupDate;
        this.pickupRequirements = pickupRequirements;
        this.destinationZip = destinationZip;
        this.deliveryZone = deliveryZone;
        this.deliveryRequirements = deliveryRequirements;
        this.items = items;
        this.quotePrice = quotePrice;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOriginZip() {
        return originZip;
    }

    public void setOriginZip(String originZip) {
        this.originZip = originZip;
    }

    public ZoneStatus getPickupZone() {
        return pickupZone;
    }

    public void setPickupZone(ZoneStatus pickupZone) {
        this.pickupZone = pickupZone;
    }

    public Date getPickupDate() {
        return pickupDate;
    }

    public void setPickupDate(Date pickupDate) {
        this.pickupDate = pickupDate;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public AccessoryStatus getPickupRequirements() {
        return pickupRequirements;
    }

    public void setPickupRequirements(AccessoryStatus pickupRequirements) {
        this.pickupRequirements = pickupRequirements;
    }

    public String getDestinationZip() {
        return destinationZip;
    }

    public void setDestinationZip(String destinationZip) {
        this.destinationZip = destinationZip;
    }

    public ZoneStatus getDeliveryZone() {
        return deliveryZone;
    }

    public void setDeliveryZone(ZoneStatus deliveryZone) {
        this.deliveryZone = deliveryZone;
    }

    public AccessoryStatus getDeliveryRequirements() {
        return deliveryRequirements;
    }

    public void setDeliveryRequirements(AccessoryStatus deliveryRequirements) {
        this.deliveryRequirements = deliveryRequirements;
    }

    public Double getQuotePrice() {
        return quotePrice;
    }

    public void setQuotePrice(Double quotePrice) {
        this.quotePrice = quotePrice * (1 + 0.02);
    }

    public Set<Item> getItems() {
        return items;
    }

    public void setItems(Set<Item> items) {
        this.items = items;
    }
}
