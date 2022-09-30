package com.example.empoloypayrollday4.empcontroller;

import com.example.empoloypayrollday4.empmodel.EmpModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicInteger;

@RestController
public class EmpController {
    private final AtomicInteger counter = new AtomicInteger();
    @GetMapping("/getbymodel")
    public EmpModel getDetail(@RequestParam String name, String lastName, String address, Integer salary, String profile, String note){
        return new EmpModel(counter.getAndIncrement(), name, lastName, address, salary, profile, note);
    }
}
