package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.*;

    @Entity
    public class Skill extends AbstractEntity {



        // Constructor with no arg.
        public Skill(){

        };
        //private String name;
        private String description;



        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }

