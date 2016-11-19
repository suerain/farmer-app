package edu.mum.farmer.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import edu.mum.farmer.app.domain.Order;

@Repository
public interface OrderRepository extends CrudRepository<Order, Long> {

//	@Query("Select distinct o from Order o join o.member m where m.id = :id")
//	public List<Order> findOrderForPerson(@Param("id") long id);

}
