package com.Issue.user.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Issue.user.entity.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	User findByName(String name);
	User findById(String Id);
	User findByIdAndPassword(String Id,String password);
	User saveAndFlush(User user);
}
