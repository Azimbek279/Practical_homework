package peaksoft.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import peaksoft.model.CarInfo;

public interface CarInfoRepository extends JpaRepository<CarInfo, Long> {
}