package me.remind.user.github.dao;

import java.util.UUID;
import org.springframework.data.repository.CrudRepository;
import me.remind.user.github.model.User;

/**
 * Interface to implement the basic database interactions to manage the users data 
 */
public interface UserDAO extends CrudRepository<User, UUID> {

}
