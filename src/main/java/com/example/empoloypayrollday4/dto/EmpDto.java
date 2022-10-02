package com.example.empoloypayrollday4.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Data //data anotation uses no need to getter setter, no argument constructor and argument constructor
public class EmpDto {
    public String firstName;
    public String lastName;
    public String address;
    public Integer salary;
    public String profilePic;
    public  String  note;
    public Date date;

    public EmpDto(String firstName, String lastName, String address, Integer salary, String profilePic, String note, Date date) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.salary = salary;
        this.profilePic = profilePic;
        this.note = note;
        this.date = date;
    }


}


