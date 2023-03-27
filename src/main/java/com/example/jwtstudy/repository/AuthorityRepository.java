package com.example.jwtstudy.repository;


import com.example.jwtstudy.entity.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
