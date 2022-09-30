package com.example.empoloypayrollday4.empservices;

import com.example.empoloypayrollday4.empmodel.EmpModel;
import com.example.empoloypayrollday4.repository.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpService {
@Autowired
    EmpRepository empRepository;

    public EmpModel savep(EmpModel empModel){
        empRepository.save(empModel);
        return empModel;
    }
    public List<EmpModel> getAll(){
        return empRepository.findAll();
    }
    public EmpModel getById(Integer id){
        return empRepository.findAll().get(id);
    }

    public EmpModel editById(Integer id, EmpModel empModel){
        EmpModel empobj = empRepository.findById(id).orElse(null);
        if(empobj != null){
            empobj.setFirstName(empModel.getFirstName());
            empobj.setLastName(empModel.getLastName());
            empobj.setAddress(empModel.getAddress());
            empobj.setSalary(empModel.getSalary());
            empobj.setProfilePic(empobj.getProfilePic());
            empobj.setNote(empModel.getNote());
            empobj.setDate(empModel.getDate());
            return empRepository.save(empobj);
        }
        return null;
    }
    public void  deleteById(Integer id){
        empRepository.deleteById(id);

    }
}
