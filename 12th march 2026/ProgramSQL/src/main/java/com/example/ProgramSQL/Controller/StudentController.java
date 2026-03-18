package com.example.ProgramSQL.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ProgramSQL.dto.request.RegisterRequest;
import com.example.ProgramSQL.dto.request.Studentrequest;
import com.example.ProgramSQL.dto.response.ApiResponse;
import com.example.ProgramSQL.dto.response.StudentResponse;
import com.example.ProgramSQL.service.StudentService;

 

@RestController
@RequestMapping("/student")
public class StudentController {
    private StudentService studentService;
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }  

    @PostMapping("/save")
    public StudentResponse saveStudentResponse(@RequestBody Studentrequest studentRequest ){
        return studentService.saveStudentResponse(studentRequest);
    } 
    @PostMapping("/{id}/register")
    public ApiResponse<StudentResponse> assignRegistration(
        @PathVariable Long id,
        @RequestBody RegisterRequest regNumber
    )
    {
        StudentResponse response=studentService.assignRegistration(id, regNumber.getRegNumber() );
        return new ApiResponse<StudentResponse>("sucess", response);
    }
}
