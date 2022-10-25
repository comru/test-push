package com.example.demo.repository;

import com.example.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    @Query("""
select u from User u where u.myFullName = ?1
order by u.myFullName desc""")
    List<User> findByMyFullName(String myFullName);
}