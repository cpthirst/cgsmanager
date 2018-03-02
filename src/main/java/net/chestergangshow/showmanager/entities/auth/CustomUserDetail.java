package net.chestergangshow.showmanager.entities.auth;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CustomUserDetail implements UserDetails {

  private static final String ROLE_PREFIX = "ROLE_";
  private String username;
  private String password;
  private Collection<? extends GrantedAuthority> authorities;

  public CustomUserDetail(User byUsername) {
    this.username = byUsername.getUsername();
    this.password = byUsername.getPassword();
    this.authorities = translate(byUsername.getRoles());
  }

  private List<GrantedAuthority> translate(List<Role> roles) {
    List<GrantedAuthority> auths = new ArrayList<>();
    for (Role role : roles) {
      String name = role.getName().toUpperCase();

      if (!name.startsWith(ROLE_PREFIX)) {
        name = ROLE_PREFIX + name;
      }
      auths.add(new SimpleGrantedAuthority(name));
    }
    return auths;
  }

  @Override
  public Collection<? extends GrantedAuthority> getAuthorities() {
    return authorities;
  }

  @Override
  public String getPassword() {
    return password;
  }

  @Override
  public String getUsername() {
    return username;
  }

  @Override
  public boolean isAccountNonExpired() {
    return true;
  }

  @Override
  public boolean isAccountNonLocked() {
    return true;
  }

  @Override
  public boolean isCredentialsNonExpired() {
    return true;
  }

  @Override
  public boolean isEnabled() {
    return true;
  }
}
