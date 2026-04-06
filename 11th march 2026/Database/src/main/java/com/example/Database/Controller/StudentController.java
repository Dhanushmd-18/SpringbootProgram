package com.example.Database.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Database.dto.request.StudentRequest;
import com.example.Database.dto.response.ApiResponse;
import com.example.Database.dto.response.StudentResponse;
import com.example.Database.service.StudentService;
import java.util.List;  

@RestController
@RequestMapping("/Student")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/process")
    public ApiResponse <StudentResponse> calResults(@RequestBody StudentRequest requests) {
        StudentResponse response = studentService.processstudent(requests);

        return new ApiResponse<StudentResponse>("success", response);   
    }

    @GetMapping("/all")
    public ApiResponse <List<StudentResponse>> getAllStudents() {
        List<StudentResponse> responses = studentService.getAllStudentsResults();
        return new ApiResponse<List<StudentResponse>>("success", responses);
    }
}