/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orcaexpress.orcatrak.entity;

import java.util.Date;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
//import javax.persistence.JoinColumn;
import javax.persistence.Temporal;

/**
 *
 * get quote; the quote is initiated by a stateless bean; no need to persist
 * this bean into an entity; it is discarded from memory once session is closed
 * unless user clicks the order button, at which point a bill of lading (bol)
 * number or internal tracking number is created; in the future the application
 * might be further developed to persist quotes.
 */

@Named
@RequestScoped
@Entity
@Table
public class Quote {

    @Id
    @Column(name = "ID", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ORIGIN_ZIP", nullable = false)
    private String originZip;

    @Column(name = "PICKUP_ZONE", nullable = false)
    private Zone pickupZone;

    @Column(name = "PICKUP_DATE", nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date pickupDate;

    @Column(name = "PICKUP_REQUIREMENTS")
    private Accessories pickupRequirements;

    @Column(name = "DESTINATION_ZIP", nullable = false)
    private String destinationZip;
    
    @Column(name = "DELIVERY_ZONE", nullable = false)
    private Zone deliveryZone;

    @Column(name = "DELIVERY_DATE", nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date deliveryDate;

    @Column(name = "DELIVERY_REQUIREMENTS")
    private Accessories deliveryRequirements;

    @ManyToOne
    @Column(name = "ITEM_LIST", nullable = false)
    private List<Item> itemList;

    @Column(name = "QUOTE_PRICE")
    private Double quotePrice;

    @ManyToOne
    @Column(name = "USER")
    private User user;

    public Quote() {
    }
    
    public Quote(Long id, String originZip, Zone pickupZone, Date pickupDate, Accessories pickupRequirements, String destinationZip, Zone deliveryZone, Date deliveryDate, Accessories deliveryRequirements, List<Item> itemList, User user) {
        this.id = id;
        this.originZip = originZip;
        this.pickupZone = pickupZone;
        this.pickupDate = pickupDate;
        this.pickupRequirements = pickupRequirements;
        this.destinationZip = destinationZip;
        this.deliveryZone = deliveryZone;
        this.deliveryDate = deliveryDate;
        this.deliveryRequirements = deliveryRequirements;
        this.itemList = itemList;
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

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }

    public Double getQuotePrice() {
        return quotePrice;
    }

    public void setQuotePrice(Double quotePrice) {
        this.quotePrice = quotePrice;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
