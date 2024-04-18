package com.educandoweb.course3.repositories;

import java.util.Arrays;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course3.entities.User;



public interface UserRepository extends JpaRepository<User, Long>{



}
