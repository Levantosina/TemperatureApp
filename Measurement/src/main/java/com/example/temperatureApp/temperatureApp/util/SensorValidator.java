package com.example.temperatureApp.temperatureApp.util;

import com.example.temperatureApp.temperatureApp.models.Sensor;
import com.example.temperatureApp.temperatureApp.services.SensorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 * @author Levantosina
 */
@Component
public class SensorValidator implements Validator {
    private final SensorService sensorService;


    public SensorValidator(SensorService sensorService) {
        this.sensorService = sensorService;
    }
    @Override
    public boolean supports(Class<?> aClass) {
        return Sensor.class.equals(aClass);
    }
    @Override
    public void validate(Object o, Errors errors) {
        Sensor sensor = (Sensor) o;

        if (sensor.getName() == null) {
            return;
        }

        if (sensorService.findByName(sensor.getName()).isPresent())
            errors.rejectValue("name", "There is already a sensor with that name!");
    }
}
