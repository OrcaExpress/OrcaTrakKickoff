package com.orcaexpress.orcatrak.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import static javax.persistence.CascadeType.MERGE;
import static javax.persistence.CascadeType.PERSIST;
import static javax.persistence.CascadeType.REMOVE;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import static javax.persistence.FetchType.LAZY;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Named
@RequestScoped
@Entity
@Table(name = "QUOTES")
public class Quote implements Serializable {

    @Id
    @Column(name = "ID", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ORIGIN_ZIP", nullable = false)
    private String originZip;// ===================================== what zipcode is the product being shipped FROM

    @Column(name = "PICKUP_ZONE", nullable = false)
    private Zone pickupZone;// ====================================== is the pickup address zoned BUSINESS or RESIDENTIAL (extra costs are associated with residential; trucks weighing more than 22,000kg are not allowed through residential homes)

    @Column(name = "PICKUP_DATE", nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date pickupDate;// ====================================== pickup date

    @Column(name = "PICKUP_REQUIREMENTS")
    @Enumerated(EnumType.STRING)
    private Accessories pickupRequirements;// ======================= ENUM does receiving customer need LIFTGATE, INSIDE_PICKUP, NOTIFY_PRIOR_TO_ARRIVAL

    @Column(name = "DESTINATION_ZIP", nullable = false)
    private String destinationZip;// ================================ what zipcode is the product being shipped TO

    @Column(name = "DELIVERY_ZONE", nullable = false)
    @Enumerated(EnumType.STRING)
    private Zone deliveryZone;// ==================================== is the delivery address zoned BUSINESS or RESIDENTIAL (extra costs are associated with residential; trucks weighing more than 22,000kg are not allowed through residential homes)

    @Column(name = "DELIVERY_DATE", nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date deliveryDate;// ==================================== what date is the product being delivered at 
    
    @Column(name = "DELIVERY_REQUIREMENTS")
    @Enumerated(EnumType.STRING)
    private Accessories deliveryRequirements;// ===================== ENUM does receiving customer need LIFTGATE, INSIDE_PICKUP, NOTIFY_PRIOR_TO_ARRIVAL

    @Column(name = "QUOTE_PRICE")
    private Double quotePrice;// ==================================== price quotation on the delivery

    @JoinColumn
    @OneToMany(cascade = {PERSIST, REMOVE, MERGE}) //can replace all 3 by ALL
    private Set<Item> items = new HashSet<>();// ==================== how many items are being quoted for in ONE shipment; more items means higher price

    @OneToMany(fetch = LAZY) //default fetch is lazy
    private User user;

    public Quote() {
    }

    public Quote(Long id, String originZip, Zone pickupZone, Date pickupDate, Accessories pickupRequirements, String destinationZip, Zone deliveryZone, Date deliveryDate, Accessories deliveryRequirements, Double quotePrice, Set<Item> items, User user) {
        this.id = id;
        this.originZip = originZip;
        this.pickupZone = pickupZone;
        this.pickupDate = pickupDate;
        this.pickupRequirements = pickupRequirements;
        this.destinationZip = destinationZip;
        this.deliveryZone = deliveryZone;
        this.deliveryDate = deliveryDate;
        this.deliveryRequirements = deliveryRequirements;
        this.items = items;
        this.quotePrice = quotePrice;
        this.user = user;
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

    public Zone getPickupZone() {
        return pickupZone;
    }

    public void setPickupZone(Zone pickupZone) {
        this.pickupZone = pickupZone;
    }

    public Date getPickupDate() {
        return pickupDate;
    }

    public void setPickupDate(Date pickupDate) {
        this.pickupDate = pickupDate;
    }

    public Accessories getPickupRequirements() {
        return pickupRequirements;
    }

    public void setPickupRequirements(Accessories pickupRequirements) {
        this.pickupRequirements = pickupRequirements;
    }

    public String getDestinationZip() {
        return destinationZip;
    }

    public void setDestinationZip(String destinationZip) {
        this.destinationZip = destinationZip;
    }

    public Zone getDeliveryZone() {
        return deliveryZone;
    }

    public void setDeliveryZone(Zone deliveryZone) {
        this.deliveryZone = deliveryZone;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public Accessories getDeliveryRequirements() {
        return deliveryRequirements;
    }

    public void setDeliveryRequirements(Accessories deliveryRequirements) {
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
