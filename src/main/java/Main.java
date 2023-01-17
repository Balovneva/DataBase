import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure("hibernate.cfg.xml").build();

        Metadata metadata = new MetadataSources(registry).getMetadataBuilder().build();
        SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();

        String url = "jdbc:mysql://localhost:3306/skillbox_2";
        String user = "root";
        String pass = "89175906046";

        String insertSql = "INSERT INTO linked_purchase_list (subscription_date, student_id, course_id, price)\n" +
                "SELECT purchaselist.subscription_date subscription_date,\n" +
                "\tstudents.id student_id,\n" +
                "    courses.id course_id,\n" +
                "    purchaselist.price price\n" +
                "from `purchaselist`\n" +
                "join `students` on students.name = purchaselist.student_name\n" +
                "join `courses` on courses.name = purchaselist.course_name";

        try {
            Connection connection = DriverManager.getConnection(url, user, pass);

            PreparedStatement prepsInsertProduct = connection.prepareStatement(insertSql);

            prepsInsertProduct.execute();

            connection.close();
            prepsInsertProduct.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        sessionFactory.close();
    }
}
