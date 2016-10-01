package com.niit.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
@Configuration
@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {
	
	             @Autowired
	                DataSource dataSource;
	                
	                @Override
	                protected void configure(HttpSecurity http)throws Exception{
	                	
	                http.authorizeRequests().antMatchers("/admin","/saveproduct").access("hasRole('ADMIN')").and().formLogin()
	                .loginPage("/login").loginProcessingUrl("/j_spring_security_check").failureUrl("/loginerror")
	                .usernameParameter("username")
	                .passwordParameter("password").defaultSuccessUrl("/homee",true).and().logout().logoutSuccessUrl("/logout").logoutUrl("/j_spring_security_logout").invalidateHttpSession(true)
                    .and().exceptionHandling().accessDeniedPage("/403").and().csrf();       
	                	

	                }
	 
	                @Autowired
	                public void configAuthentication(AuthenticationManagerBuilder auth) throws Exception {
	                                auth.jdbcAuthentication().dataSource(dataSource)
	                                                                .authoritiesByUsernameQuery("select user_id,role_name from user_role where user_id=?")
	                                                                .usersByUsernameQuery("select username,password,enabled from user_details where username=?");	}

}	