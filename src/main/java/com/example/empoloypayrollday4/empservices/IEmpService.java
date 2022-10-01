package com.example.empoloypayrollday4.empservices;

import com.example.empoloypayrollday4.dto.EmpDto;
import com.example.empoloypayrollday4.dto.EmpResponseDto;
import com.example.empoloypayrollday4.empmodel.EmpModel;

import java.util.List;

public interface IEmpService {
    public EmpModel savePost(EmpModel empModel);
    List<EmpModel> getAll();
    EmpModel getById(Integer id);
    EmpModel update(Integer id, EmpModel empModel);
    void deleteId(Integer id);

}
