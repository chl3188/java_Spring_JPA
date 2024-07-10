package me.luji.study;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Account {
    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false)
    private String username;

    private String password;

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

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }
}
