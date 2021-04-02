package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

@Entity
    public class Skill extends AbstractEntity {

        @NotBlank(message = "description is required")
        private String description;

        @ManyToMany(mappedBy = "skills")
        private List<Job> jobs = new ArrayList<>();


        // Constructor with no arg.
        public Skill(){
        }

        public Skill(String desc){
            super();
            this.description = desc;
        }


        public String getDescription() {
            return description;
        }
        public void setDescription(String description) {
            this.description = description;
        }

        public List<Job> getJobs(){
            return jobs;
        }

        public void setJobs(List<Job> jobs){
            this.jobs = jobs;
        }
    }

