package com.example.temperatureApp.temperatureApp.repositories;

import com.example.temperatureApp.temperatureApp.models.Sensor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @author Levantosina
 */
public interface SensorRepository extends JpaRepository<Sensor, Integer> {
Optional<Sensor>findByName(String name);
}
