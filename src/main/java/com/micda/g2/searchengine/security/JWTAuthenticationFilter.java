package com.micda.g2.searchengine.security;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.micda.g2.searchengine.model.Person;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

public class JWTAuthenticationFilter extends UsernamePasswordAuthenticationFilter {

    public AuthenticationManager authenticationManager;

    public JWTAuthenticationFilter(AuthenticationManager authenticationManager) {
        this.authenticationManager = authenticationManager;
    }

    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response)
            throws AuthenticationException {


    	Person  user = null;
        try {
            user = new ObjectMapper().readValue(request.getInputStream(),Person.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("*********  from JWT Filter **********");
        System.out.println(user.getEmail());

        System.out.println(user.getPassword());

        return authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
                user.getEmail(),user.getPassword()));

    }

    @Override
    protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain,
                                            Authentication authResult) throws IOException, ServletException {

        User SUser = (User) authResult.getPrincipal();

        String jwtoken = Jwts.builder()
                .setSubject(SUser.getUsername())
                .setExpiration( new Date(System.currentTimeMillis()+SecurityConst.EXPERATION_TIME))
                .signWith(SignatureAlgorithm.HS512,SecurityConst.SECRECT)
                .claim("roles",SUser.getAuthorities())
                .compact();
        response.setHeader(SecurityConst.HEADER_STRING,SecurityConst.TOKEN_PREFIX + jwtoken);

    }
}
