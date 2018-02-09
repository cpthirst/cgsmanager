package net.chestergangshow.showmanager.entities.auth;

import org.springframework.data.annotation.Id;

public class Role {

  @Id
  private String id;
  private String name;

  public Role() {
  }

  public Role(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
