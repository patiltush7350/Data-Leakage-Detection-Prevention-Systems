package com.data.service;

import jakarta.annotation.PostConstruct;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.data.Model.Role;
import com.data.Model.RoleName;
import com.data.repository.RoleRepository;

@Service
public class RoleInitializer {

    @Autowired
    private RoleRepository roleRepository;

    @PostConstruct
    public void initRoles() {
    	RoleName roleName = RoleName.ROLE_NAME; 
        List<Role> roles = roleRepository.findByName(roleName);
        if (roles.size() > 1) {
            // Handle the case where multiple roles are found
            System.out.println("Multiple roles found: " + roles);
        } else if (roles.size() == 1) {
            // Handle the single result case
            System.out.println("Single role found: " + roles.get(0));
        } else {
            // Handle no results found case
            System.out.println("No roles found");
        }
    }
}