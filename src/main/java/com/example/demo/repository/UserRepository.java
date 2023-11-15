package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.User;

//crud 함수를 jqarepository가 들고 있음
public interface UserRepository extends JpaRepository<User, Integer> {
 public User findByUsername(String username); //Jpa 커리 메소드 함수
}
