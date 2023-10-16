package com.uppermoons.sankar.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uppermoons.sankar.Model.User;

public interface UserRepository extends JpaRepository<User,String>{
    
}
