package com.data.service;

import java.util.HashSet;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.data.Model.Role;
import com.data.Model.RoleName;
import com.data.Model.User;
import com.data.repository.RoleRepository;
import com.data.repository.UserRepository;

import jakarta.transaction.Transactional;

@Service
public class UserServiceImpl implements UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    @Lazy
    private PasswordEncoder passwordEncoder;

    @Override
    public void save(User user) {
        logger.info("Saving user: {}", user.getUsername());

        // Encode the password
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        
        // Ensure user roles are set
        if (user.getRoles().isEmpty()) { 
            List userRole = roleRepository.findByName(RoleName.ROLE_USER);
            if (userRole != null) {
            	user.getRoles().addAll(userRole);
            } else {
                logger.error("Default role ROLE_USER not found in the database");
                throw new RuntimeException("Default role not found");
            }
        }

        // Save the user
        try {
            userRepository.save(user);
            logger.info("User saved successfully: {}", user.getUsername());
        } catch (Exception e) {
            logger.error("Error saving user: ", e);
            throw e;
        }
    }

    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
