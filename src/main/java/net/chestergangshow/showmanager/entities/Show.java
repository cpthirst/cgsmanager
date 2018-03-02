package net.chestergangshow.showmanager.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document(collection="show")
public class Show {

  @Id
  private String id;
  private String venue;
  private Integer year;
  @DBRef(db="item")
  private List<Item> items = new ArrayList<>();

  public Show() {
  }

  public Show(String venue, Integer year) {
    this.venue = venue;
    this.year = year;
  }

  public String getVenue() {
    return venue;
  }

  public void setVenue(String venue) {
    this.venue = venue;
  }

  public Integer getYear() {
    return year;
  }

  public void setYear(Integer year) {
    this.year = year;
  }

  public List<Item> getItems() {
    return items;
  }

  public void setItems(List<Item> items) {
    this.items = items;
  }
}
