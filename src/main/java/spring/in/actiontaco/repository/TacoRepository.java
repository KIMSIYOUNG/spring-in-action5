package spring.in.actiontaco.repository;

import org.springframework.data.repository.CrudRepository;

import spring.in.actiontaco.domain.Taco;

public interface TacoRepository extends CrudRepository<Taco, Long> {
}
