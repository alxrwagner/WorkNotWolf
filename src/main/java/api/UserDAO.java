package api;

import model.Person;

import java.util.List;

public interface UserDAO {
    void create(Person person);

    Person getById(int id);

    List<Person> getAll();

    void remove(Person person);

    void change(Person person);
}
