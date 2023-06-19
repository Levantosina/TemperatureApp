package com.example.temperatureClient.DTO;

import java.util.List;

/**
 * @author Levantosina
 */
public class MeasureRespons {
    List<MeasurementDTO> measurements;
    public List<MeasurementDTO > getMeasurements() {
        return measurements;
    }

    public void setMeasurements(List<MeasurementDTO> measurements) {
        this.measurements = measurements;
    }
}
