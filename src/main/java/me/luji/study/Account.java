package me.luji.study;

import jakarta.persistence.*;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Account {
    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false)
    private String username;

    private String password;

    @OneToMany(mappedBy = "owner")
    private Set<Study> stuides = new HashSet<>();

//    @Temporal(TemporalType.TIMESTAMP)
//    private Date created;
//
//    @Transient
//    private String no;
//
//    @Embedded
//    @AttributeOverrides({
//            @AttributeOverride(name="street", column = @Column(name = "home_street") )
//    })
//    private Address address;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Study> getStuides() {
        return stuides;
    }

    public void setStuides(Set<Study> stuides) {
        this.stuides = stuides;
    }

    public void addStudy(Study study) {
        this.getStuides().add(study);
        study.setOwner(this);
    }

    public void removeStudy(Study study) {
        this.getStuides().remove(study);
        study.setOwner(null);
    }
}
