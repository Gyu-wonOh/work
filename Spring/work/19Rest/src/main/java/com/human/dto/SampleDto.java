package com.human.dto;

public class SampleDto {

  private Integer mno;
  private String firstName;
  private String lastName;

  public Integer getMno() {
    return mno;
  }

  public void setMno(Integer mno) {
    this.mno = mno;
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

  @Override
  public String toString() {
    return "SampleVO [mno=" + mno + ", firstName=" + firstName + ", lastName=" + lastName + "]";
  }
}