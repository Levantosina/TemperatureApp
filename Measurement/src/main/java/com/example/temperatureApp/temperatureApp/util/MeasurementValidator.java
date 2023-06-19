package com.example.temperatureApp.temperatureApp.util;

import com.example.temperatureApp.temperatureApp.models.Measurement;
import com.example.temperatureApp.temperatureApp.services.SensorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;




/**
 * @author Levantosina
 */
@Component
public class MeasurementValidator implements Validator {

    private final SensorService sensorService;
    @Autowired
    public MeasurementValidator(SensorService sensorService) {
        this.sensorService = sensorService;
    }
    @Override
    public boolean supports(Class<?> aClass) {
        return Measurement.class.equals(aClass);
    }
    @Override
    public void validate(Object o, Errors errors) {
        Measurement measurement = (Measurement) o;

        if (measurement.getSensor() == null) {
            return;
        }

        if (sensorService.findByName(measurement.getSensor().getName()).isEmpty())
            errors.rejectValue("sensor", "There is no registered sensor with that name!");
    }

}
