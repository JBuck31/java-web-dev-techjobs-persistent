package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;


@Entity
public class Employer extends AbstractEntity {

    @NotBlank
    @Size(max = 50)
    private String location;

    private List<Job> jobs = new ArrayList<>();

    public Employer(@NotBlank @Size(max = 50) String location) {
        this.location = location;
    }


    //no argument constructor for hibernate
    public Employer(){
    }

    //getters and setters
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
