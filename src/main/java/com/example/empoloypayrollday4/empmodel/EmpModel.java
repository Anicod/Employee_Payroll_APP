package com.example.empoloypayrollday4.empmodel;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EmpModel {
    @Id
    public Integer Id;
    public String firstName;
    public String lastName;
    public String address;
    public Integer salary;
    public String profilePic;
    public String note;

    public EmpModel() {

    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
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

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public EmpModel(Integer id, String firstName, String lastName, String address, Integer salary, String profilePic, String note) {
        Id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.salary = salary;
        this.profilePic = profilePic;
        this.note = note;
    }
}
