package com.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.beans.User;

@Repository
public interface UserDao extends JpaRepository<User, Integer>{

}
