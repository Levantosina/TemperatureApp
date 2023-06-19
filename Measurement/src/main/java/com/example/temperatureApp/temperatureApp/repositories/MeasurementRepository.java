package com.example.temperatureApp.temperatureApp.repositories;

import com.example.temperatureApp.temperatureApp.models.Measurement;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Levantosina
 */
public interface MeasurementRepository extends JpaRepository<Measurement, Integer>{

}
