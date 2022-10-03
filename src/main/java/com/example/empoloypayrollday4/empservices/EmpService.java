package com.example.empoloypayrollday4.empservices;

import com.example.empoloypayrollday4.dto.EmpDto;
import com.example.empoloypayrollday4.dto.EmpResponseDto;
import com.example.empoloypayrollday4.empmodel.EmpModel;
import com.example.empoloypayrollday4.exception.EmpolyPayrollException;
import com.example.empoloypayrollday4.repository.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpService implements IEmpService {
@Autowired
    EmpRepository empRepository;

//    public EmpModel savep(EmpModel empModel){
//        empRepository.save(empModel);
//        return empModel;
//    }
//    public List<EmpModel> getAll(){
//        return empRepository.findAll();
//    }
//    public EmpModel getById(Integer id){
//        return empRepository.findAll().get(id);
//    }
//
//    public EmpModel editById(Integer id, EmpModel empModel){
//        EmpModel empobj = empRepository.findById(id).orElse(null);
//        if(empobj != null){
//            empobj.setFirstName(empModel.getFirstName());
//            empobj.setLastName(empModel.getLastName());
//            empobj.setAddress(empModel.getAddress());
//            empobj.setSalary(empModel.getSalary());
//            empobj.setProfilePic(empobj.getProfilePic());
//            empobj.setNote(empModel.getNote());
//            empobj.setDate(empModel.getDate());
//            return empRepository.save(empobj);
//        }
//        return null;
//    }
//    public void  deleteById(Integer id){
//        empRepository.deleteById(id);
//
//    }


    @Override
    public EmpModel savePost(EmpModel empModel) {
        empRepository.save(empModel);
        return empModel;

    }

    @Override
    public List<EmpModel> getAll() {
        return empRepository.findAll();
    }

    @Override
    public EmpModel getById(Integer id) {
        return empRepository.findAll().get(id);
    }

    @Override
    public EmpModel update(Integer id, EmpModel empModel) {
        EmpModel empObj = empRepository.findById(id).orElse(null);
        if(empObj != null){
            empObj.setFirstName(empModel.getFirstName());
            empObj.setLastName(empModel.getLastName());
            empObj.setAddress(empModel.getAddress());
            empObj.setSalary(empModel.getSalary());
            empObj.setProfilePic(empModel.getProfilePic());
            empObj.setNote(empModel.getNote());
            empObj.setDate(empModel.getDate());
            empObj.setGender(empModel.getGender());
            empObj.setDepartment(empModel.getDepartment());
            return empRepository.save(empObj);
        }
        return null;
    }

    @Override
    public void deleteId(Integer id) {
        List<EmpModel> list = empRepository.findAll();
        EmpModel newEmp = list.stream().filter(empModel -> empModel.getId() == id)
                        .findFirst()
                                .orElseThrow(() -> new EmpolyPayrollException("employee not found"));
        empRepository.deleteById(newEmp.getId());

    }
}
