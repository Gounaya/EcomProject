package com.Signinup.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Signinup.model.Role;

/**
 * Store data in a relational database.
 * RoleRepository inherits several methods for working with Role persistence, including methods for saving, deleting, and finding Role entities.
 * @author ogounaya
 */
@Repository("RoleRepository")
public interface RoleRepository extends JpaRepository<Role, Long>{
	Role findByRole(String role);
}
