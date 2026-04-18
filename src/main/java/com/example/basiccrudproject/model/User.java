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

    @Column(name = "full_name",
            columnDefinition = "TEXT",
            nullable = false)
    private String fullName;

    @Column(name = "gender", columnDefinition = "VARCHAR(1)")
    private String gender;

    @Column(name = "status", columnDefinition = "VARCHAR(20)")
    private String status;

    @CreationTimestamp
    @Column(name = "create_dttm",
            columnDefinition = "TIMESTAMP WITH TIME ZONE",
            nullable = false)
    private LocalDateTime createDttm;

    @UpdateTimestamp
    @Column(name = "modify_dttm",
            columnDefinition = "TIMESTAMP WITH TIME ZONE",
            nullable = false)
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
