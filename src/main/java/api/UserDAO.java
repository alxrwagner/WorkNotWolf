package api;

import model.User;

import java.util.List;

public interface UserDAO {
    void create(User user);

    User getById(int id);

    List<User> getAll();

    void remove(User user);

    void change(User user);
}
