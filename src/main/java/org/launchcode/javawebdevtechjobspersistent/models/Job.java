package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Job extends AbstractEntity{ //from part 3 inherits id and name fields

    @ManyToOne
    private Employer employer; //part 3

//    private String skills;

    @ManyToMany
    private List<Skill> skills = new ArrayList<>();

    public Job() {
    }

    public Job(Employer anEmployer, List<Skill> someSkills) {
        super();
        this.employer = anEmployer;
        this.skills = someSkills;
    }

    // Getters and setters. Refactored in part 3
    public String getEmployer() {
        return String.valueOf(employer);
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

    public List<Skill> getSkills() {
        return skills;
    }
}
