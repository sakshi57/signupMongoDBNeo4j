package com.EntreClub.signup.signup.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection = "signup")
public class signup {

    private String firstname;
    private String lastname;

    @Id
    private String emailid;

    private String contact;
    private String password;
    private String dob;
    private String gender;
    private String city;
    private String company;
    private String position;
    private String description;
  //  private String[] haves;

    public signup(){}

    public signup(String firstname, String lastname, String emailid, String contact, String password, String dob, String gender, String city, String company, String position, String description) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.emailid = emailid;
        this.contact = contact;
        this.password = password;
        this.dob = dob;
        this.gender = gender;
        this.city = city;
        this.company = company;
        this.position = position;
        this.description = description;
       // this.haves = haves;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getemailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

   /* public String[] getHaves() {
        return haves;
    }

    public void setHaves(String[] haves) {
        this.haves = haves;
    }*/
}
