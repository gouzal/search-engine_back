package com.micda.g2.searchengine.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.micda.g2.searchengine.model.Person;
import com.micda.g2.searchengine.repository.IPersonRepository;
import com.micda.g2.searchengine.service.AccountService;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserDetailsService, IPersonRepository {


    @Autowired
    private AccountService accountService;
    

    @Override
    public UserDetails loadUserByUsername(String Email) throws UsernameNotFoundException {

        Person  user = accountService.findUserByUsername(Email);
        System.out.println("UserServiceImpl->loadUserByUsername : ");

        if(user==null){
            throw new UsernameNotFoundException(Email);
        }

        Collection<GrantedAuthority> authorities = new ArrayList<>();
        user.getRoles().forEach(r->{
            authorities.add(new SimpleGrantedAuthority(r.getRolename()));
        });

        return new User(user.getEmail(),user.getPassword(),authorities);
    }



	@Override
	public List<Person> findAll() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public List<Person> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public List<Person> findAllById(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public <S extends Person> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public <S extends Person> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public void deleteInBatch(Iterable<Person> entities) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public Person getOne(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public <S extends Person> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public <S extends Person> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public Page<Person> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public <S extends Person> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public Optional<Person> findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public boolean existsById(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void delete(Person entity) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void deleteAll(Iterable<? extends Person> entities) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public <S extends Person> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public <S extends Person> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public <S extends Person> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public <S extends Person> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public Person findByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}
}
