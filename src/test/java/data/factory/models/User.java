package data.factory.models;

import java.text.DateFormat;

public abstract class User {
    String role;
    String name;
    String login;
    String lastname;
    String email;
    Boolean isAdmine;
    Sex sex;
    Boolean isEmployee;
    String holidaySupervisor; // хз как ссылаться
    String password;
    String adress;
    String mailIndex;
    String city;
    String country; // keywords list
    String phone;
    String fax;
    String jobTitle;
    DateFormat birthday;

}
