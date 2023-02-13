package api;

import config.HibernateSessionFactoryUtil;
import model.Person;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class UserDAOImpl implements UserDAO {
    @Override
    public void create(Person person) {
        try (Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.save(person);
            transaction.commit();
        }
    }

    @Override
    public Person getById(int id) {
        try (Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession()) {
            return session.get(Person.class, id);
        }
    }

    @Override
    public List<Person> getAll() {
        try (Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession()) {
            return session.createQuery("SELECT id, name, login, roleId as role FROM Person").list();
        }
    }

    @Override
    public void remove(Person person) {
        try (Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.delete(person);
            transaction.commit();
        }
    }

    @Override
    public void change(Person person) {
        try (Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession()){
            Transaction transaction = session.beginTransaction();
            session.update(person);
            transaction.commit();
        }
    }
}
