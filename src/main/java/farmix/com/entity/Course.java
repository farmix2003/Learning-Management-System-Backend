package farmix.com.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data

public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private String category;

    @ManyToOne
    @JoinColumn(name = "instructor_id")
    private User instructor;
}
