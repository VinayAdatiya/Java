package entity;

import java.util.ResourceBundle;

;

public class Register {
    private String name;
    private String email;
    private String password;
    private Gender gender;
    private String city;

    public Register(String name, String email, String password, Gender gender, String city) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.gender = gender;
        this.city = city;
    }

    public Register() {

    }

    @Override
    public String toString() {
        return "Profile :-" +
                "\n    Name = "+name+
                "\n    Email='" + email+
                "\n    Gender=" + gender +
                "\n    City='" + city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}