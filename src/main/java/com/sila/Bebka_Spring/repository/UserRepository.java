package com.sila.Bebka_Spring.repository;

import com.sila.Bebka_Spring.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User , Long> {

}
