package com.example.jforce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.jforce.Entity.User;

@Repository

public interface UserRepository extends JpaRepository<User, Integer> {

	User findByPassword(String password);

	User findByEmailid(String emailid);
	

}
