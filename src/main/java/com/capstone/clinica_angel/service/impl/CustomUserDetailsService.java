
package com.capstone.clinica_angel.service.impl;

import java.sql.CallableStatement;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {
    
    private final JdbcTemplate jdbcTemplate;
    
    @Autowired
    public CustomUserDetailsService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        String sp = "CALL sp_login(?)";
        
        Map<String, Object> result = jdbcTemplate.call(con -> {
            CallableStatement callableStatement = con.prepareCall(sp);
            
            callableStatement.setString(1, username);
            
            return callableStatement;
        }, Collections.emptyList());
        
        String fetchedUsername = (String) result.get("username");
        String hashedPassword = (String) result.get("hashed_password");
        List<String> roles = (List<String>) result.get("roles");
        
        UserDetails userDetails = User.builder()
                .username(fetchedUsername)
                .password(hashedPassword)
                .authorities(roles.toArray(String[]::new))
                .build();
        
        return userDetails;
    }
    
}
