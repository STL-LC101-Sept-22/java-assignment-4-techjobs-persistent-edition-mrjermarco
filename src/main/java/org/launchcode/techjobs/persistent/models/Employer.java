package org.launchcode.techjobs.persistent.models;


import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

        @NotNull(message = "Location is required")
        @Size(min = 5, max = 24, message = "Location must be between 5-24 characters long")
        private String location;

        @OneToMany
        @JoinColumn(name="employer_id")
        public List<Job> jobs = new ArrayList<>();
        public Employer() {
        }

        public String getLocation() {
            return location;
        }
        public void setLocation(String location) {

        }

        public List<Job> getJobs(){
            return jobs;
        }

        public void setJobs(List<Job> jobs){
            this.jobs = jobs;
        }
}
