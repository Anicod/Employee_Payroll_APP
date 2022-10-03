package com.example.empoloypayrollday4.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.util.Date;

@Data //data anotation uses no need to getter setter, no argument constructor and argument constructor
public class EmpDto {
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\\\s]{4,}$", message = "name is invalid")
    public String firstName;
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\\\s]{3,}$", message = "last name is invalid")
    public String lastName;
   @NotEmpty(message = "address is requried")
    public String address;
  @Min(value = 5000, message = "must be greater than 5000")
   @Max(value = 1000000, message = "must be greater than 1000000")

    public Integer salary;
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\\\s]{3,}$", message = "profile pic invalid")
    public String profilePic;
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\\\s]{3,}$", message = "invalid note")
    public  String  note;
    @JsonFormat
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


