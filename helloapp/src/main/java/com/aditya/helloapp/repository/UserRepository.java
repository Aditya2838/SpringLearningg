
package com.aditya.helloapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.aditya.helloapp.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
