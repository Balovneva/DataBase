import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name = "Students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToMany(mappedBy = "student")
    private List<Subscription> subscriptions;

    @Column(length = 45)
    private String name;

    private int age;

    @Column(name = "registration_date")
    private Timestamp registrationDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Timestamp getSubscriptionDate() {
        return registrationDate;
    }

    public void setSubscriptionDate(Timestamp subscriptionDate) {
        this.registrationDate = subscriptionDate;
    }
}
