package net.chestergangshow.showmanager.controllers;

import net.chestergangshow.showmanager.entities.auth.CustomUserDetail;
import org.springframework.security.core.context.SecurityContextHolder;
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
    CustomUserDetail userDetail = (CustomUserDetail) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    return "Logged in user is " + userDetail.getUsername();
  }
}
