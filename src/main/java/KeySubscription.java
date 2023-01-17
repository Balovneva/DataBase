import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class KeySubscription implements Serializable {

    @Column(name = "student_id")
    int studentId;

    @Column(name = "course_id")
    int courseId;

    public KeySubscription() {}

    public KeySubscription(Student student, Course course) {
        this.studentId = student.getId();
        this.courseId = course.getId();
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KeySubscription that = (KeySubscription) o;
        return studentId == that.studentId && courseId == that.courseId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId, courseId);
    }
}
