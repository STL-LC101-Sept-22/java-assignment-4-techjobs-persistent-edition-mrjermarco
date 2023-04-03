package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {

    @NotBlank(message = "Description is required")
    @Size(min = 100, max = 500, message = "Description must be between 100-500 characters long")
    private String description;

    public String getDescription() {
        return description;
    }

    public static void main(String[] args) {

    }

}