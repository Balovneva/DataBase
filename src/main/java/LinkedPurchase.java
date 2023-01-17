import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "Linked_purchase_List")
public class LinkedPurchase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "subscription_date")
    private Timestamp subscriptionDate;

    @Column(name = "student_id")
    private String studentId;

    @Column(name = "course_id")
    private String courseId;

    private int price;
}
