package poly.store.service.impl;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;


import poly.store.dao.OrderDAO;
import poly.store.dao.OrderDetailDAO;
import poly.store.dao.ProductDAO;
import poly.store.dao.RoleDAO;
import poly.store.entity.Order;
import poly.store.entity.OrderDetail;
import poly.store.entity.Product;
import poly.store.entity.Role;
import poly.store.service.OrderService;
import poly.store.service.ProductService;
import poly.store.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService{
	@Autowired
	RoleDAO rdao;

	@Override
	public List<Role> findAll() {
		return rdao.findAll();
	}



}
