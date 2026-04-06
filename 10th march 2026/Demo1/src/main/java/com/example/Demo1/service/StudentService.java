package com.example.Demo1.service;

import org.springframework.stereotype.Service;

import com.example.Demo1.dto.request.StudentRequest;
import com.example.Demo1.dto.response.StudentResponse;  

@Service
public class StudentService {
    
    public StudentResponse calStdentResponse(StudentRequest req)
    {
        int total=0;
        total= req.getMarks1()+req.getMarks2()+req.getMarks3()+req.getMarks4()+req.getMarks5();

        double percentage=total/5.0;
        String result=percentage>=75 ?"pass":"fail";
        return new StudentResponse(req.getName(), req.getRollnumber(), total, percentage, result);
    }
}
