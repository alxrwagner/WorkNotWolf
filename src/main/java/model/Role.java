package model;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private Integer roleId;
    @Column(name = "title")
    private String title;
    @ManyToMany(mappedBy = "roleId")
    private List<Person> people;

    public Role() {
    }

    public Role(String title) {
        this.title = title;
    }

    public long getRole_id() {
        return roleId;
    }

    public void setRole_id(Integer role_id) {
        this.roleId = role_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Person> getPeople() {
        return people;
    }

    public void setUsers(List<Person> people) {
        this.people = people;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Role role = (Role) o;
        return roleId == role.roleId && Objects.equals(title, role.title) && Objects.equals(people, role.people);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roleId, title, people);
    }

    @Override
    public String toString() {
        return "ID: " + roleId +
                ", Роль: " + title;
    }
}
