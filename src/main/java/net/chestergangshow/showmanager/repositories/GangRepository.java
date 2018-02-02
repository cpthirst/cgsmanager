package net.chestergangshow.showmanager.repositories;

import net.chestergangshow.showmanager.entities.GangMember;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GangRepository extends MongoRepository<GangMember, String> {

  public List<GangMember> findByFirstName(String firstName);

  public List<GangMember> findByLastName(String lastName);

  public List<GangMember> findBySection(String section);
}
