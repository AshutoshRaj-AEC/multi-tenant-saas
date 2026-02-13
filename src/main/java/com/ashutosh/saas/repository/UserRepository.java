package com.ashutosh.saas.repository;

import com.ashutosh.saas.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
