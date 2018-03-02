package net.chestergangshow.showmanager.repositories;

import net.chestergangshow.showmanager.entities.Show;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShowRepository extends MongoRepository<Show, String> {

  public List<Show> findByYear(Integer year);

  public List<Show> findByVenue(String venue);
}
