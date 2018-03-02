package net.chestergangshow.showmanager.controllers;

import net.chestergangshow.showmanager.entities.GangMember;
import net.chestergangshow.showmanager.service.GangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/gang")
public class GangController {

  @Autowired
  private GangService gangService;

  @GetMapping(value = "/")
  public List<GangMember> gang() {
    return gangService.getGang();
  }

  @PostMapping(value="/add")
  public void addGangMember(@RequestBody GangMember gangMember) {
    gangService.save(gangMember);
  }

}