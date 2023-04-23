package com.example.demo.repository;

import com.example.demo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author devcxl
 */
public interface UserRepository extends JpaRepository<User,Integer> {

}
