package com.orcaexpress.orcatrak.entity;

import java.io.Serializable;
import java.util.Arrays;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

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

    @Column(name = "EXTREME_LENGTH")
    private boolean isExtremeLength;

    @Column(name = "FREEZE_SUSEPTIBLE")
    private boolean isFreezeSuseptible;

     
}
