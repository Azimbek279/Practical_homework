package peaksoft.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import peaksoft.model.Car;

public interface CarRepository extends JpaRepository<Car, Long> {
}