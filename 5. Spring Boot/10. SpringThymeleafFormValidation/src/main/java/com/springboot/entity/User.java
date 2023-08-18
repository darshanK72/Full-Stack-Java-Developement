package com.springboot.entity;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class User {

    @NotBlank(message = "First Name cannot be blank")
    @Size(min = 3,max = 12,message = "First Name must be between 3 - 12 characters")
    private String firstName;

    @NotBlank(message = "First Name cannot be blank")
    @Size(min = 3,max = 12,message = "First Name must be between 3 - 12 characters")
    private String lastName;

    @NotBlank(message = "Date of birth cannot be blank")
    private String dob;

    // @NotEmpty(message = "Gender cannot be empty")
    // private String gender;

    @Email(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$" ,message = "Email is not valid")
    private String email;

    @NotBlank(message = "Passord cannto be blank")
    private String password;

    @NotBlank(message = "cannot be blank")
    private String street;

    @NotBlank(message = "cannot be blank")
    private String city;

    @NotBlank(message = "cannot be blank")
    private String state;

    @NotBlank(message = "cannot be blank")
    private String pincode;
    
    public User() {
    }

    public User(String firstName, String lastName, String dob, /*String gender, */String email, String password,
            String street, String city, String state, String pincode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        // this.gender = gender;
        this.email = email;
        this.password = password;
        this.street = street;
        this.city = city;
        this.state = state;
        this.pincode = pincode;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    // public void setGender(String gender) {
    //     this.gender = gender;
    // }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDob() {
        return dob;
    }

    // public String getGender() {
    //     return gender;
    // }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getPincode() {
        return pincode;
    }

    @Override
    public String toString() {
        return "User [firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob + /*", gender=" + gender +*/ ", email=" + email + ", password=" + password + ", street=" + street + ", city=" + city + ", state="
                + state + ", pincode=" + pincode + "]";
    }

    
    

}
