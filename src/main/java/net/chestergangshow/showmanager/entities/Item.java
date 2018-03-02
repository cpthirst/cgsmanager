package net.chestergangshow.showmanager.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document(collection = "item")
public class Item {

  @Id
  private String id;
  private Integer runningOrder;
  private String name;
  private String description;
  private Integer lengthInMins;
  @DBRef(db="gangMember")
  private List<GangMember> cast = new ArrayList<>();

  public Item() {
  }

  public Item(Integer runningOrder, String name) {
    this.runningOrder = runningOrder;
    this.name = name;
  }

  public Integer getRunningOrder() {
    return runningOrder;
  }

  public void setRunningOrder(Integer runningOrder) {
    this.runningOrder = runningOrder;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Integer getLengthInMins() {
    return lengthInMins;
  }

  public void setLengthInMins(Integer lengthInMins) {
    this.lengthInMins = lengthInMins;
  }

  public List<GangMember> getCast() {
    return cast;
  }

  public void setCast(List<GangMember> cast) {
    this.cast = cast;
  }
}
