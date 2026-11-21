package ie.atu.sample.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "booking")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int attendeeCount;
    private Long id;
    private String organiserName;
    private String bookingStatus = "ACTIVE";


    @ManyToOne
    @JoinColumn(name = "room_id", nullable = false);
    private Room room;

}
