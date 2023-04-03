package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Employer extends AbstractEntity {

        @NotBlank(message = "Location is required")
        @Size(min = 5, max = 24, message = "Location must be between 5-24 characters long")
        private String location;

        public String getLocation() {
            return location;
        }

    public static void main(String[] args) {


    }


}
