package com.example.empoloypayrollday4.empmodel;

import com.example.empoloypayrollday4.dto.EmpDto;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data //data anotation uses no need to getter setter, no argument constructor and argument constructor 

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
    public String gender;
    public String department;

    public EmpModel(){

    }

//    public EmpModel(String firstName, String lastName, String address, Integer salary, String profilePic, String note, Date date){
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.address = address;
//        this.salary = salary;
//        this.profilePic = profilePic;
//        this.note = note;
//        this.date = date;
//    }
    public EmpModel(EmpDto empDto){
        this.firstName = empDto.firstName;
        this.lastName = empDto.lastName;
        this.address = empDto.address;
        this.salary = empDto.salary;
        this.profilePic = empDto.profilePic;
        this.note =  empDto.note;
        this.date = empDto.date;
        this.gender = empDto.gender;
        this.department = empDto.department;
    }
}
