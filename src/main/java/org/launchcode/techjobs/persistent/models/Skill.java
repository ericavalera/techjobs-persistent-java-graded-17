package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;

@Entity
public class Skill extends AbstractEntity {

    private String description;
    //public accessor
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    // no arg constructor
    public Skill(){}
}
