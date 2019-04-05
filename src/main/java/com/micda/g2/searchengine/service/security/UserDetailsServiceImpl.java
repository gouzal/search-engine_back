package com.micda.g2.searchengine.service.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.micda.g2.searchengine.model.Person;

import java.util.ArrayList;
import java.util.Collection;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {


    @Autowired
    private AccountService accountService;

    @Override
    public UserDetails loadUserByUsername(String Email) throws UsernameNotFoundException {

        Person  user = accountService.findUserByUsername(Email);
        System.out.println("UserDetailsServiceImpl->loadUserByUsername : ");

        if(user==null){
            throw new UsernameNotFoundException(Email);
        }

        Collection<GrantedAuthority> authorities = new ArrayList<>();
        user.getRoles().forEach(r->{
            authorities.add(new SimpleGrantedAuthority(r.getRolename()));
        });

        return new User(user.getEmail(),user.getPassword(),authorities);
    }
}
