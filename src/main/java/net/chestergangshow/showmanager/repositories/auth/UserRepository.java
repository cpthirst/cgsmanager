package net.chestergangshow.showmanager.repositories.auth;

import net.chestergangshow.showmanager.entities.auth.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

  public User findByUsername(String firstName);

}
