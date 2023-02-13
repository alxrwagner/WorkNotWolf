package api;

import config.HibernateSessionFactoryUtil;
import model.Role;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class RoleDAOImpl implements RoleDAO {
    @Override
    public void create(Role role) {
        try (Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.save(role);
            transaction.commit();
        }
    }

    @Override
    public Role getById(int id) {
        try (Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession()) {
            return session.get(Role.class, id);
        }
    }

    @Override
    public List<Role> getAll() {
        try (Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession()) {
            return session.createQuery("FROM Role").list();
        }
    }

    @Override
    public void remove(Role role) {
        try (Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.delete(role);
            transaction.commit();
        }
    }

    @Override
    public void change(Role role) {
        try (Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.update(role);
            transaction.commit();
        }
    }
}
