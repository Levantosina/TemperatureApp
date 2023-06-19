package com.example.temperatureApp.temperatureApp.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

/**
 * @author Levantosina
 */
public class SensorDTO {
    @NotEmpty(message = "The name should not be empty!")
    @Size(min = 3, max = 30, message = "The name of the sensor must be from 3 to 30 characters!")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
