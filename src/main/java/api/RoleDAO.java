package api;

import model.Role;

import java.util.List;

public interface RoleDAO {
    void create(Role role);

    Role getById(int id);

    List<Role> getAll();

    void remove(Role role);

    void change(Role role);
}
