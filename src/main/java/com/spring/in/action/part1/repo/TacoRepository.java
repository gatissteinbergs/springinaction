package com.spring.in.action.part1.repo;

import com.spring.in.action.part1.domain.Taco;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TacoRepository extends CrudRepository<Taco, Long> {
}
