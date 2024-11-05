package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class Employer extends AbstractEntity {
    @NotBlank(message ="Location can not be blank")
    @Size(max=50 )
    private String location;

//  public accessors
    public @NotBlank String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
//  No arg constructor
    public Employer(){}
}
