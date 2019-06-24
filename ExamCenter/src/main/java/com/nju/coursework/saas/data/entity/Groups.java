package com.nju.coursework.saas.data.entity;


import javax.persistence.*;

/**
 * Created by zhouxiaofan on 2017/12/4.
 */
@Entity
public class Groups {
    private String name;
    private String students;
    private int id;
    private User userByUserId;

    @Basic
    @Column(name = "name", nullable = true, length = 20)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "students", nullable = true, length = 5000)
    public String getStudents() {
        return students;
    }

    public void setStudents(String students) {
        this.students = students;
    }

    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Groups groups = (Groups) o;

        if (id != groups.id) return false;
        if (name != null ? !name.equals(groups.name) : groups.name != null) return false;
        if (students != null ? !students.equals(groups.students) : groups.students != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (students != null ? students.hashCode() : 0);
        result = 31 * result + id;
        return result;
    }

    @Override
    public String toString() {
        return "Groups{" +
                "name='" + name + '\'' +
                ", students='" + students + '\'' +
                ", id=" + id +
                ", userByUserId=" + userByUserId +
                '}';
    }

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    public User getUserByUserId() {
        return userByUserId;
    }

    public void setUserByUserId(User userByUserId) {
        this.userByUserId = userByUserId;
    }
}
