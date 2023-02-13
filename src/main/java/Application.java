import api.RoleDAO;
import api.RoleDAOImpl;
import api.UserDAO;
import api.UserDAOImpl;
import model.Role;
import model.Person;

public class Application {
    public static void main(String[] args) {
        RoleDAO roleDAO = new RoleDAOImpl();
        UserDAO userDAO = new UserDAOImpl();

        Role admin = new Role("Admin");
        Role moder = new Role("Moder");
        Role user = new Role("User");

//        Role admin = roleDAO.getById(1);
//        Role moder = roleDAO.getById(2);
//        Role user = roleDAO.getById(3);



//        Person person1 = new Person("Kleopatra", "klepa13", "234987", admin);
//        Person person2 = new Person("Orleorle", "orle", "456765", moder);
//        Person person3 = new Person("Vismut", "pigPepa", "387934", user);

//        roleDAO.create(admin);
//        roleDAO.create(moder);
//        roleDAO.create(user);
////
//        userDAO.create(new Person("Kleopatra", "klepa13", "234987", admin));
//        userDAO.create(new Person("Orleorle", "orle", "456765", moder));
//        userDAO.create(new Person("Vismut", "pigPepa", "387934", user));

//        userDAO.change(userDAO.getById(1).setRoleId(1));

//        roleDAO.getAll().forEach(System.out::println);
//        userDAO.getAll().forEach(System.out::println);

        userDAO.getAll().forEach(System.out::println);
    }
}
