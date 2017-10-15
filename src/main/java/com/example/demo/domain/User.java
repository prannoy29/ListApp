package com.example.demo.domain;

import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "user")
public class User implements Serializable {

    private static final long serialVersionUID = 54567890l;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "userId")
    private long userId;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    @Column(name ="name", nullable = false)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "phoneNumber",nullable = false)
    private String phoneNumber;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Column(name = "emailId", nullable = false)
    private  String emailId;

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    @Column(name = "birthDate")
    private String birthDate;

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    protected User() {}

    public User(String name, String phoneNumber, String emailId, String birthDate) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailId = emailId;
        this.birthDate = birthDate;
    }
}
