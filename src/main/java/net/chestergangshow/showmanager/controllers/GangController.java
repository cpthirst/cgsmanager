package net.chestergangshow.showmanager.controllers;

import net.chestergangshow.showmanager.entities.GangMember;
import net.chestergangshow.showmanager.service.GangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GangController {

  @Autowired
  private GangService gangService;

  @GetMapping(value = "/gang")
  public List<GangMember> gang() {
    return gangService.getGang();
  }

  @PostMapping(value="/gang/add")
  public void addGangMember(@RequestBody GangMember gangMember) {
    gangService.insert(gangMember);
  }

}