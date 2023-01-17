import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "Subscriptions")
public class Subscription {

    @EmbeddedId
    KeySubscription id;

    @ManyToOne
    @MapsId("id")
    @JoinColumn(name = "student_id")
    Student student;

    @ManyToOne
    @MapsId("id")
    @JoinColumn(name = "course_id")
    Course course;

    @Column(name = "subscription_date")
    Timestamp subscriptionDate;

    public KeySubscription getId() {
        return id;
    }

    public void setId(KeySubscription id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Timestamp getSubscriptionDate() {
        return subscriptionDate;
    }

    public void setSubscriptionDate(Timestamp subscriptionDate) {
        this.subscriptionDate = subscriptionDate;
    }
}