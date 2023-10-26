
package com.capstone.clinica_angel.config;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class AdminUserSetup implements ApplicationRunner {
    
    private final JdbcTemplate jdbcTemplate;
    private final BCryptPasswordEncoder passwordEncoder;
    
    @Autowired
    public AdminUserSetup(JdbcTemplate jdbcTemplate, BCryptPasswordEncoder passwordEncoder) {
        this.jdbcTemplate = jdbcTemplate;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void run(ApplicationArguments args) {
        
        String checkAdmin = "CALL sp_check_created_admin()";
        List<Integer> adminCount = jdbcTemplate.query(checkAdmin, (rs, rowNum) -> rs.getInt(1));

        if (adminCount.isEmpty()) {
            String adminUsername = "admin";
            String adminPassword = "@Dm1n&7";
            String hashedPassword = passwordEncoder.encode(adminPassword);

            String createAdmin = "CALL sp_nuevo_usuario(?, ?, ?, ?)";
            jdbcTemplate.update(createAdmin, adminUsername, hashedPassword, 1, 0);// 1 -> admin role, 0 -> id_trab
        }
    }
    
}
