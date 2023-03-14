package peaksoft.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

import static jakarta.persistence.CascadeType.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "user_seq")
    @SequenceGenerator(name = "user_seq",sequenceName = "user_seq",allocationSize = 1)
    private Long id;

    private String email;

    private String password;

    private String role;

    private String phone_number;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER,mappedBy = "user")
    private List<Car> cars = new ArrayList<>();

    @OneToOne(cascade = {REFRESH,MERGE,PERSIST,DETACH},fetch = FetchType.EAGER,mappedBy = "user")
    private Role roles;
}
