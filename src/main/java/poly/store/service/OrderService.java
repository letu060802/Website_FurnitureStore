package poly.store.service;


import java.util.List;
import java.util.Optional;

import com.fasterxml.jackson.databind.JsonNode;

import poly.store.entity.Order;



public interface OrderService {

	Order create(JsonNode orderData);
	
	Order findById(Long id);

	List<Order> findByUsername(String username);


}
