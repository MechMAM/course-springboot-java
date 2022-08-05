package com.javacourse.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javacourse.course.entities.User1;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User1> findAll() {
		User1 u = new User1(1L, "Vader", "vader@gmail", "58974", "12345");
		return ResponseEntity.ok().body(u);
	}

}
