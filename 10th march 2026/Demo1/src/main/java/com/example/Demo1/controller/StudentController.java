package com.example.Demo1.controller;

import org.springframework.web.bind.annotation.*;

import com.example.Demo1.dto.request.StudentRequest;
import com.example.Demo1.dto.response.ApiResponse;
import com.example.Demo1.dto.response.StudentResponse;
import com.example.Demo1.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/calc")
    public ApiResponse getResult(@RequestBody StudentRequest request) {

        StudentResponse result = studentService.calStdentResponse(request);

        return new ApiResponse("Success", result);
    }
}