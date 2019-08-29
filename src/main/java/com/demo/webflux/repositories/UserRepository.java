package com.demo.webflux.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.webflux.model.User;
import com.demo.webflux.util.UserType;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	public User findByUserIdAndUserType(int userId, UserType userType);
}
