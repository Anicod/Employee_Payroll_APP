package com.example.empoloypayrollday4.empmodel;

import com.example.empoloypayrollday4.dto.EmpDto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class EmpModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer Id;
    public String firstName;
    public String lastName;
    public String address;
    public Integer salary;
    public String profilePic;
    public String note;
    public Date date;
    public Integer empId;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public EmpModel() {

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

    public EmpModel(String firstName, String lastName, String address, Integer salary, String profilePic, String note, Date date){
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.salary = salary;
        this.profilePic = profilePic;
        this.note = note;
        this.date = date;
    }
    public EmpModel(Integer id, EmpDto empDto){
        this.empId =  id;
        this.firstName = empDto.firstName;
        this.lastName = empDto.lastName;
        this.address = empDto.address;
        this.salary = empDto.salary;
        this.profilePic = empDto.profilePic;
        this.note =  empDto.note;
        this.date = empDto.date;
    }
}
