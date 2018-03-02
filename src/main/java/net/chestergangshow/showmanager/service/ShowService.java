package net.chestergangshow.showmanager.service;

import net.chestergangshow.showmanager.entities.Show;
import net.chestergangshow.showmanager.repositories.ShowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShowService {

  @Autowired
  private ShowRepository showRepository;

  public List<Show> getShows() {
    return showRepository.findAll();
  }

  public List<Show> getShowsByYear(Integer searchYear) {
    return showRepository.findByYear(searchYear);
  }

  public List<Show> getShowsByVenue(String searchVenue) {
    return showRepository.findByVenue(searchVenue);
  }

  public void save(Show show) {
    showRepository.save(show);
  }
}
