package net.chestergangshow.showmanager.service;

import net.chestergangshow.showmanager.entities.GangMember;
import net.chestergangshow.showmanager.repositories.GangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GangService {

  @Autowired
  private GangRepository gangRepository;

  public List<GangMember> getGang() {
    return gangRepository.findAll();
  }

  public void save(GangMember gangMember) {
    gangRepository.save(gangMember);
  }
}
