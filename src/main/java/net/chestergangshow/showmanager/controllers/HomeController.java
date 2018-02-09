package net.chestergangshow.showmanager.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

  @GetMapping(value = "/")
  public String index() {
    return "index";
  }

  @GetMapping(value = "/private")
  public String privateArea() {
    return "private";
  }
}
