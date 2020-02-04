package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.*;

@Entity
public class Job extends AbstractEntity{ //from part 3 inherits id and name fields

    @ManyToOne
    private Employer employer; //part 3

    private String skills;

    public Job() {
    }

    public Job(Employer anEmployer, String someSkills) {
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

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }


}
