package com.example.empoloypayrollday4.exception;

import com.example.empoloypayrollday4.dto.EmpResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class EmpolyeePayrollExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<EmpResponseDto> method(MethodArgumentNotValidException exception){
        return null;
    }




    @ExceptionHandler(EmpolyPayrollException.class)

   public ResponseEntity<EmpResponseDto> handle(EmpolyPayrollException exception){
//        List<ObjectError> errList = exception.getBindingResult().getAllErrors();
//        List<String> errMesg = errList.stream().map(objectError -> objectError.getDefaultMessage()).collect(Collectors.toList());
        EmpResponseDto empResponseDto = new EmpResponseDto(exception.getMessage(), "exception while processing request");
        return new ResponseEntity<>(empResponseDto, HttpStatus.BAD_REQUEST);
    }


}
