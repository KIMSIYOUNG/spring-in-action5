package spring.in.actiontaco.repository;

import org.springframework.data.repository.CrudRepository;

import spring.in.actiontaco.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {

    User findByUsername(String username);
}
