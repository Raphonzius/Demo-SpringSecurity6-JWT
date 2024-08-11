package io.github.raphonzius.demospringsecurity6jwt.repository;

import io.github.raphonzius.demospringsecurity6jwt.model.Users;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<Users, Integer> {

    Optional<Users> findByUsername(String username);

}
