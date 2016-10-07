package com.orcaexpress.orcatrak.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 * Represents an item on which bidders bid.
 */
//@Entity
//@Table(name = "ITEMS")
public class Item implements Serializable {

    private Long id;
    private String description;
    private String classificication;
    private int pieces;
    private byte weight;
    private boolean isStackable = false;
    private boolean isHazmat = false;

    public Item(String description, String classificication, int pieces, byte weight, boolean isStackable, boolean isHazmat) {
        this.description = description;
        this.classificication = classificication;
        this.pieces = pieces;
        this.weight = weight;
        this.isStackable = isStackable;
        this.isHazmat = isHazmat;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getClassificication() {
        return classificication;
    }

    public void setClassificication(String classificication) {
        this.classificication = classificication;
    }

    public int getPcs() {
        return pieces;
    }

    public void setPcs(int pieces) {
        this.pieces = pieces;
    }

    public byte getWeight() {
        return weight;
    }

    public void setWeight(byte weight) {
        this.weight = weight;
    }

    public boolean isIsStackable() {
        return isStackable;
    }

    public void setIsStackable(boolean isStackable) {
        this.isStackable = isStackable;
    }

    public boolean isIsHazmat() {
        return isHazmat;
    }

    public void setIsHazmat(boolean isHazmat) {
        this.isHazmat = isHazmat;
    }
}
