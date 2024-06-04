package com.data.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.data.Model.Role;
import com.data.Model.RoleName;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

	List<Role> findByName(RoleName name);
}
