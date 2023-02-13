package model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "login")
    private String login;
    @Column(name = "password")
    private String password;
    @Column(name = "role_id")
    private Integer roleId;
    @ManyToMany
    private List<Role> roles;

    public Person() {
    }

    public Person(String name, String login, String password, Role... roles) {
        this.name = name;
        this.login = login;
        this.password = password;
        this.roles = new ArrayList<>();
        Collections.addAll(this.roles, roles);
    }

    public Person(String name, String login, String password, Integer roleId) {
        this.name = name;
        this.login = login;
        this.password = password;
        this.roleId = roleId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(id, person.id) && Objects.equals(name, person.name) && Objects.equals(login, person.login) && Objects.equals(password, person.password) && Objects.equals(roleId, person.roleId) && Objects.equals(roles, person.roles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, login, password, roleId, roles);
    }

    @Override
    public String toString() {
        return "ID: " + id +
                ", Имя: '" + name  +
                ", Логин: '" + login +
                ", Пароль: '" + '*' * password.length()  +
                ", Роли: " + roles;
    }
}
