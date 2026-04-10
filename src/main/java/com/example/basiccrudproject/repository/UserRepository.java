package com.example.basiccrudproject.repository;

import com.example.basiccrudproject.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByFullName(String full_name);
    List<User> findByGender(String gender);
    List<User> findByStatus(String status);
}
