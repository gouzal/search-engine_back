package com.micda.g2.searchengine.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;


@Configuration
@EnableWebSecurity
public class securityconfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private UserDetailsService userDetailsService;

    @Autowired
    private BCryptPasswordEncoder bcyBCryptPasswordEncoder;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

     /*   auth.inMemoryAuthentication()
                .withUser("admin").password("1234").roles("ADMIN","USER")
                .and()
                .withUser("user").password("1234").roles("USER");
*/

     auth.userDetailsService(userDetailsService).passwordEncoder(bcyBCryptPasswordEncoder);

    }



    @Override
    protected void configure(HttpSecurity securityHttp) throws Exception
    {
        securityHttp.csrf().disable();
        securityHttp.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
        securityHttp.authorizeRequests().antMatchers("/login/**","/register/**").permitAll();
        securityHttp.authorizeRequests().antMatchers(HttpMethod.POST,"/tasks/**").hasAuthority("ADMIN");
        securityHttp.authorizeRequests().anyRequest().authenticated();
        securityHttp.addFilter(new JWTAuthenticationFilter(authenticationManager()));
        securityHttp.addFilterBefore(new JWTAuthorizationFilter(),UsernamePasswordAuthenticationFilter.class);

    }


}
