package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {
    @NotBlank(message ="Location can not be blank")
    @Size(max=50 )
    private String location;

    //Task 3
    @OneToMany
    //this annotation needs a name parameter, usually through "id";
    @JoinColumn(name = "employer_id")
    private List<Job> jobs = new ArrayList<>();

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
