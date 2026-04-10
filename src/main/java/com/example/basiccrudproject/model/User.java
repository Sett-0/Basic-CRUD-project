package com.example.basiccrudproject.model;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity(name = "clients")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullName;
    private String gender;
    private String status;

    @CreationTimestamp
    private LocalDateTime createDttm;

    @UpdateTimestamp
    private LocalDateTime modifyDttm;

    public String getFullName() {
        return fullName;
    }
    public void setFullName(String full_name) {
        this.fullName = full_name;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
}
