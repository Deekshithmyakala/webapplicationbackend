package com.webapplication.assignment.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.webapplication.assignment.Entity.Users;

@Repository
public interface UserRepo extends CrudRepository<Users, Integer> {

	Users save(Users user);

	Users findByUserId(String userId);
}
