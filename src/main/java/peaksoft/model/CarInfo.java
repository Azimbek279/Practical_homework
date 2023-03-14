package peaksoft.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

import static jakarta.persistence.CascadeType.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "car_info")
public class CarInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "car_info_seq")
    @SequenceGenerator(name = "car_info_seq",sequenceName = "car_info_seq",allocationSize = 1)
    private Long id;

    private LocalDate year_of_issue;

    private String engine;

    private String color;

    private int price;

    @OneToOne(cascade = {REFRESH,MERGE,DETACH,PERSIST},fetch = FetchType.LAZY)
    private Car car;

}
