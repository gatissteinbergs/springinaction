package com.spring.in.action.part1.repo;

import com.spring.in.action.part1.domain.Ingredient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IngredientRepository extends CrudRepository<Ingredient, String> {
}
