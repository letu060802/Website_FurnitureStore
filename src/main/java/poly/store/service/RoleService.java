package poly.store.service;


import java.util.List;
import java.util.Optional;

import com.fasterxml.jackson.databind.JsonNode;

import poly.store.entity.Order;
import poly.store.entity.Role;



public interface RoleService {

	public List<Role> findAll();


}
