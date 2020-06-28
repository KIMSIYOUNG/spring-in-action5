package spring.in.actiontaco.repository;

import org.springframework.data.repository.CrudRepository;

import spring.in.actiontaco.domain.Ingredient;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {
}
