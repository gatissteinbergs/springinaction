package com.spring.in.action.part1.repo;

import com.spring.in.action.part1.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    User findByUsername(String username);
}
