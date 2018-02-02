package net.chestergangshow.showmanager.entities;

import org.springframework.data.annotation.Id;

import java.util.Date;

public class GangMember {

  @Id
  private String id;
  private String firstName;
  private String lastName;
  private String address;
  private String postcode;
  private String homePhone;
  private Date dob;
  private String emailAddress;
  private String group;
  private String section;
  private String schoolCollege;
  private String headTeacher;
  private Boolean permissionReceived;

  public GangMember() {
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getPostcode() {
    return postcode;
  }

  public void setPostcode(String postcode) {
    this.postcode = postcode;
  }

  public String getHomePhone() {
    return homePhone;
  }

  public void setHomePhone(String homePhone) {
    this.homePhone = homePhone;
  }

  public Date getDob() {
    return dob;
  }

  public void setDob(Date dob) {
    this.dob = dob;
  }

  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public String getGroup() {
    return group;
  }

  public void setGroup(String group) {
    this.group = group;
  }

  public String getSection() {
    return section;
  }

  public void setSection(String section) {
    this.section = section;
  }

  public String getSchoolCollege() {
    return schoolCollege;
  }

  public void setSchoolCollege(String schoolCollege) {
    this.schoolCollege = schoolCollege;
  }

  public String getHeadTeacher() {
    return headTeacher;
  }

  public void setHeadTeacher(String headTeacher) {
    this.headTeacher = headTeacher;
  }

  public Boolean getPermissionReceived() {
    return permissionReceived;
  }

  public void setPermissionReceived(Boolean permissionReceived) {
    this.permissionReceived = permissionReceived;
  }
}
