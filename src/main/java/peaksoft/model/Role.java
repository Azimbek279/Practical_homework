package peaksoft.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "role_seq")
    @SequenceGenerator(name = "role_seq",sequenceName = "role_seq",allocationSize = 1)
    private Long id;

    private String role;

    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private User user;

}
