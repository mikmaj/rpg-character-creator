package com.example.demo.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="chars")

public class RPChar {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @NotBlank(message = "Please provide a name for your character")
    @Column(name = "name")
    private String name;

    @Column(name = "sex")
    private String sex;

    @Column(name = "race")
    private String race;

    @Column(name = "alignment")
    private String alignment;

    @Column(name = "char_class")
    private String charClass;

    @Column(name = "strength")
    private long strength;

    @Column(name = "dexterity")
    private long dexterity;

    @Column(name = "constitution")
    private long constitution;

    @Column(name = "intelligence")
    private long intelligence;

    @Column(name = "wisdom")
    private long wisdom;

    @Column(name = "charisma")
    private long charisma;

    public RPChar() {}

    public RPChar(String name, String sex, String race, String alignment, String charClass, long strength, long dexterity, long constitution, long intelligence, long wisdom, long charisma) {
        this.name = name;
        this.sex = sex;
        this.race = race;
        this.alignment = alignment;
        this.charClass = charClass;
        this.strength = strength;
        this.dexterity = dexterity;
        this.constitution = constitution;
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.charisma = charisma;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getAlignment() {
        return alignment;
    }

    public void setAlignment(String alignment) {
        this.alignment = alignment;
    }

    public String getCharClass() {
        return charClass;
    }

    public void setCharClass(String charClass) {
        this.charClass = charClass;
    }

    public long getStrength() {
        return strength;
    }

    public void setStrength(long strength) {
        this.strength = strength;
    }

    public long getDexterity() {
        return dexterity;
    }

    public void setDexterity(long dexterity) {
        this.dexterity = dexterity;
    }

    public long getConstitution() {
        return constitution;
    }

    public void setConstitution(long constitution) {
        this.constitution = constitution;
    }

    public long getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(long intelligence) {
        this.intelligence = intelligence;
    }

    public long getWisdom() {
        return wisdom;
    }

    public void setWisdom(long wisdom) {
        this.wisdom = wisdom;
    }

    public long getCharisma() {
        return charisma;
    }

    public void setCharisma(long charisma) {
        this.charisma = charisma;
    }

    @Override
    public String toString() {
        return String.format(
                "Character[id=%d, name='%s', sex='%s', race='%s', alignment='%s', charClass='%s', strength='%s', dexterity='%s', constitution='%s', intelligence='%s', wisdom='%s', charisma='%s']",
                id, name, sex, race, alignment, charClass, strength, dexterity, constitution, intelligence, wisdom, charisma);
    }
}
