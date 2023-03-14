package peaksoft.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

import static jakarta.persistence.CascadeType.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
@Table(name = "cars")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "car_seq")
    @SequenceGenerator(name = "car_seq",
    sequenceName = "car_seq",allocationSize = 1)
    private Long id;

    private String brand;

    private String model;

    private LocalDate createdAt;

    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER,mappedBy = "car")
    private CarInfo carInfo;

    @ManyToOne(cascade = {REFRESH,MERGE,DETACH,PERSIST},fetch = FetchType.LAZY)
    private User user;
}
