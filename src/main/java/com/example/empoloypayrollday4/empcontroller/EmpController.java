package com.example.empoloypayrollday4.empcontroller;

import com.example.empoloypayrollday4.dto.EmpDto;
import com.example.empoloypayrollday4.dto.EmpResponseDto;
import com.example.empoloypayrollday4.empmodel.EmpModel;
import com.example.empoloypayrollday4.empservices.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@RestController
public class EmpController {
    private final AtomicInteger counter = new AtomicInteger();
   //uc1
    @GetMapping("/getbymodel")
    public EmpModel getDetail(@RequestParam String name, String lastName, String address, Integer salary, String profile, String note, Date date){
        return new EmpModel( name, lastName, address, salary, profile, note, date);
    }
    //uc2
    @Autowired
    EmpService empService;

//    @PostMapping("/postdata")
//    public ResponseEntity<EmpModel> postEmp(@RequestBody EmpModel empModel){
//        return new ResponseEntity<>(empService.savep(empModel), HttpStatus.OK);
//    }
////    @GetMapping("/getall")
////    public List<EmpModel> getDataAll(){
////        return empService.getAll();
////    }
////    @GetMapping("/getbyid")
////    public EmpModel getById(@RequestParam Integer id){
////        return empService.getById(id);
////    }
////
////    @PutMapping("/update/{id}")
////    public EmpModel editId(@PathVariable Integer id, @RequestBody EmpModel empModel){
////        return empService.editById(id, empModel);
////    }
////
////    @DeleteMapping("/delete")
////    public String deleteid(@RequestParam Integer id){
////         empService.deleteById(id);
////         return "delete id successfully";
////    }

    @PostMapping("/postbydto")
    public ResponseEntity<EmpResponseDto> postByDto(@RequestBody EmpDto empDto){
        EmpModel empModel = null;
        empModel = new EmpModel(empDto);
        EmpModel newempModel = empService.savePost(empModel);
        EmpResponseDto empResponseDto = new EmpResponseDto(newempModel, "posted employeepayroll data");
        return new ResponseEntity<>(empResponseDto, HttpStatus.OK);
    }
    @GetMapping("/getallbydto")
    public ResponseEntity<EmpResponseDto> getData(){
        List<EmpModel> emp = empService.getAll();
        EmpResponseDto empResponseDto = new EmpResponseDto(emp, "list added");
        return new ResponseEntity<>(empResponseDto, HttpStatus.OK);
    }
    @GetMapping("/getbyiddto")
    public ResponseEntity<EmpResponseDto> getById(@RequestParam Integer id){
        EmpModel empModel = empService.getById(id);
        EmpResponseDto empResponseDto = new EmpResponseDto(empModel, "found successfully");
        return new ResponseEntity<>(empResponseDto, HttpStatus.OK);
    }
    @PutMapping("/updatebydto/{id}")
    public ResponseEntity<EmpResponseDto> update(@PathVariable Integer id, @RequestBody EmpModel empModel ){
        EmpModel newEmpModel = empService.update(id, empModel);
        EmpResponseDto empResponseDto = new EmpResponseDto(newEmpModel, "data updated successfully");
        return new ResponseEntity<>(empResponseDto, HttpStatus.OK);
    }
    @DeleteMapping("/deleteid")
    public String deleteId(@RequestParam Integer id){
        empService.deleteId(id);
        return "id deleted successfully";
    }



}
