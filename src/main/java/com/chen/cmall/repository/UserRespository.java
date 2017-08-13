package com.chen.cmall.repository;

import com.chen.cmall.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRespository extends JpaRepository<User,Integer>{

    User findByUsername(String username);


}
