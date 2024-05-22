package example.benefits_of_abstract;

import cz.java11.hibernate.hql.entity.Customer;
import cz.java11.hibernate.hql.entity.Order;
import cz.java11.hibernate.hql.entity.OrderItem;
import cz.java11.hibernate.hql.entity.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    SessionFactory sessionFactory;

    private static boolean isTest = false;

    private static HibernateUtil instance;

    private HibernateUtil() {
        sessionFactory = new Configuration()
                .configure(getConfigFile())

                .addAnnotatedClass(User.class)
                .buildSessionFactory();
    }


    public static HibernateUtil getInstance() {
        if (instance == null) {
            instance = new HibernateUtil();
        }
        return instance;
    }

    private String getConfigFile() {
        return isTest ? "test/hibernate.cfg.xml" : "hibernate.cfg.xml";
    }

    public Session openSession() {
        return sessionFactory.openSession();
    }

    public static void setIsTest(boolean isTest) {
        HibernateUtil.isTest = isTest;
    }
}
