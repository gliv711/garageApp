package io.tutorial.spring.garageapp.Repository;

import io.tutorial.spring.garageapp.Model.Car;
import org.springframework.data.repository.CrudRepository;

public interface GarageRepository extends CrudRepository<Car, Long> {
}
