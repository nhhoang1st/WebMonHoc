package com.leansecurity.main.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.leansecurity.main.model.User;

@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Integer> {
  User findByEmail(String email);
}