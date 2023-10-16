package com.uppermoons.sankar.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uppermoons.sankar.Model.User;

public interface UserRepositorys extends JpaRepository<User,Long> {

	Optional<User>findByEmail(String email);
}
