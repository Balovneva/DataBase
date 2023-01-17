import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "PurchaseList")
public class Purchase {

    @EmbeddedId
    KeyPurchase id;

    @Column(name = "student_name", insertable = false, updatable = false)
    String studentName;

    @Column(name = "course_name", insertable = false, updatable = false)
    String courseName;

    int price;

    @Column(name = "subscription_date")
    Timestamp subscriptionDate;

    public KeyPurchase getId() {
        return id;
    }

    public void setId(KeyPurchase id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Timestamp getSubscriptionDate() {
        return subscriptionDate;
    }

    public void setSubscriptionDate(Timestamp subscriptionDate) {
        this.subscriptionDate = subscriptionDate;
    }
}
