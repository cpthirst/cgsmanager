package net.chestergangshow.showmanager.controllers;

import net.chestergangshow.showmanager.entities.Show;
import net.chestergangshow.showmanager.service.ShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/show")
public class ShowController {

  @Autowired
  private ShowService showService;

  @PostMapping(value="/add")
  public void addGangMember(@RequestBody Show show) {
    showService.save(show);
  }
}
