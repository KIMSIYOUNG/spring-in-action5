package spring.in.actiontaco.repository;

import org.springframework.data.repository.CrudRepository;

import spring.in.actiontaco.domain.Order;

public interface OrderRepository extends CrudRepository<Order, Long> {
}
