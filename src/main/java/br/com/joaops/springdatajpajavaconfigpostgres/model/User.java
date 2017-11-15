package br.com.joaops.springdatajpajavaconfigpostgres.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name="users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String title;

    @Column(name = "id_role")
    private long idRole;

    public User(String title, long idRole) {
        this.title = title;
        this.idRole = idRole;
    }

    public User() {

    }

    public Long getBook_id() {

        return id;
    }

    public void setBook_id(Long book_id) {
        this.id = book_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getIdRole() {
        return idRole;
    }

    public void setIdRole(long idRole) {
        this.idRole = idRole;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", idRole=" + idRole +
                '}';
    }
}
