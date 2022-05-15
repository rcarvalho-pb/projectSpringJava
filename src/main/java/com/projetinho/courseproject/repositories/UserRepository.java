package com.projetinho.courseproject.repositories;

import com.projetinho.courseproject.entities.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{

}