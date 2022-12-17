package poly.store.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import poly.store.dao.AccountDAO;
import poly.store.dao.AuthorityDAO;
import poly.store.entity.Account;
import poly.store.entity.Authority;
import poly.store.service.AccountService;
import poly.store.service.AuthorityService;

@Service
public class AuthorityServiceImpl implements AuthorityService{
	@Autowired
	AuthorityDAO adao;
	
	@Autowired
	AccountDAO acdao;

	@Override
	public List<Authority> findAll() {
		return adao.findAll();
	}

	@Override
	public Authority create(Authority auth) {
		return adao.save(auth);
	}

	@Override
	public void delete(Integer id) {
		adao.deleteById(id);
		
	}

	@Override
	public List<Authority> findAuthoritiesOfAdministrators() {
		List<Account> accounts = acdao.getAdministrators();
		return adao.authoritiesOf(accounts);
	}
	


	
}
