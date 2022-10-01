package com.example.empoloypayrollday4.dto;

public class EmpResponseDto {
public Object data;
public String message;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public EmpResponseDto(Object data, String message) {
        this.data = data;
        this.message = message;
    }
}
