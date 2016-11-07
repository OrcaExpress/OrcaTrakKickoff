package com.orcaexpress.orcatrak.entity.old;

import java.io.Serializable;
import java.util.Arrays;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

//@Entity
//@Table(name = "ITEMS")
public class Item implements Serializable {

    @Id
    @Column(name = "ID", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "CLASSIFICATION", nullable = false)
    private String classificication;

    @Column(name = "PIECES")
    private Byte pieces;

    @Column(name = "WEIGHT", nullable = false)
    private Byte weight;

    @Column(name = "STACKABLE")
    private boolean isStackable = false;

    @Column(name = "HAZMAT")
    private boolean isHazmat = false;

    @Column(name = "EXTREME_LENGTH")
    private boolean isExtremeLength;

    @Column(name = "FREEZE_SUSEPTIBLE")
    private boolean isFreezeSuseptible;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Byte getPieces() {
        return pieces;
    }

    public void setPieces(Byte pieces) {
        this.pieces = pieces;
    }

    public Byte getWeight() {
        return weight;
    }

    public void setWeight(Byte weight) {
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

    public boolean isIsExtremeLength() {
        return isExtremeLength;
    }

    public void setIsExtremeLength(boolean isExtremeLength) {
        this.isExtremeLength = isExtremeLength;
    }

    public boolean isIsFreezeSuseptible() {
        return isFreezeSuseptible;
    }

    public void setIsFreezeSuseptible(boolean isFreezeSuseptible) {
        this.isFreezeSuseptible = isFreezeSuseptible;
    }

     
}
