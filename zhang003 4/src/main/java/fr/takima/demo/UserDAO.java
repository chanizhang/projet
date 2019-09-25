package fr.takima.demo;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;






/**
 *
 */
@Repository
public interface UserDAO extends CrudRepository<User, Long> {

  }

