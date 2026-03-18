package com.example.ProgramSQL.service;

import org.springframework.stereotype.Service;

 
import com.example.ProgramSQL.repository.StudentRepository; 
import com.example.ProgramSQL.dto.request.Studentrequest;
import com.example.ProgramSQL.dto.response.StudentResponse;
import com.example.ProgramSQL.entity.RequestNumberEntity;
import com.example.ProgramSQL.entity.Studententity;
import com.example.ProgramSQL.repository.RegisterNumberRepository;  
@Service
public class StudentService {
    private final StudentRepository studentRepository;
    private final RegisterNumberRepository registerNumberRepository;


    public StudentService(StudentRepository studentRepository , RegisterNumberRepository registerNumberRepository   ) {
        this.studentRepository = studentRepository;
        this.registerNumberRepository = registerNumberRepository;
    }  
    public StudentResponse saveStudentResponse(Studentrequest studentRequest) {
        Studententity student=new Studententity();
        student.setName(studentRequest.getName());
   
        Studententity savedStudent=studentRepository.save(student);
        return new StudentResponse(savedStudent.getId(),savedStudent.getName(),null );

    }

    public StudentResponse assignRegistration(Long StudentId, String regNumber)
    {
        Studententity student=studentRepository.findById(StudentId).orElseThrow(()-> new RuntimeException("Student not found"));
        
            RequestNumberEntity register=new RequestNumberEntity();
            register.setRegNumber(regNumber);
            RequestNumberEntity savedregister= registerNumberRepository.save(register);
            student.setRequestNumberEntity(savedregister);

            studentRepository.save(student);
        return new StudentResponse(student.getId(), student.getName(),   register.getRegNumber());
    }

}
