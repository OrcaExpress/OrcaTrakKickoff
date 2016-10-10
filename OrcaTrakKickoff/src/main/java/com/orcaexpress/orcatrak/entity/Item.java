package com.orcaexpress.orcatrak.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ITEMS")
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

    public Item() {
    }
    
    public Item(Long id, String description, String classificication, Byte pieces, Byte weight) {
        this.id = id;
        this.description = description;
        this.classificication = classificication;
        this.pieces = pieces;
        this.weight = weight;
    }

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
}
