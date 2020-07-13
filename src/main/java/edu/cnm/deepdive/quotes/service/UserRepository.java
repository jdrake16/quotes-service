package edu.cnm.deepdive.quotes.service;

import edu.cnm.deepdive.quotes.model.entity.User;
import java.util.Optional;
import javax.management.relation.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

  Optional<User> findFirstByOauthKey(String oauthKey);

  Iterable<User> getAllByRoleOrderByDisplayNameAsc(Role role);

}
