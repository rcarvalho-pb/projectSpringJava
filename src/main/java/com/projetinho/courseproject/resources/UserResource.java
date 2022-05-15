package com.projetinho.courseproject.resources;

import com.projetinho.courseproject.entities.User;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  //pra saber que é um controlador REST
@RequestMapping(value = "/users")
public class UserResource {

  @GetMapping
  public ResponseEntity<User> findAll(){
    User u = new User(1L, "Maria", "maria@gmail.com", "999999999", "password");

    return ResponseEntity.ok().body(u);
  }
  
}
