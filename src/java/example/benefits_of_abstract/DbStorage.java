package example.benefits_of_abstract;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class DbStorage extends Storage {

    @Override
    public User findUser(String name) {
        Session session = HibernateUtil.getInstance().openSession();
        User user = session.get(User.class, name);
        session.close();
        return user;
    }

    @Override
    public void addUser(User user) {
        Session session = HibernateUtil.getInstance().openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(user);
        transaction.commit();
        session.close();
    }

    @Override
    public void setDeposit(User user, int amount) {
        Session session = HibernateUtil.getInstance().openSession();
        user.setDeposit(amount);
        Transaction transaction = session.beginTransaction();
        session.merge(user);
        transaction.commit();
        session.close();
    }
}