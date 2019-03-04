package com.Signinup.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.Signinup.model.User;

/**
 * to Read User information
 * The interface must extend Repository and be typed to the domain class and an ID type.
 * Store data in a relational database.
 * UserRepository inherits several methods for working with User persistence, including methods for saving, deleting, and finding User entities.
 * @author ogounaya
 */

@Repository("UserRepository")
public interface UserRepository extends JpaRepository<User, Long>{
	User findByEmail(String email);
}
