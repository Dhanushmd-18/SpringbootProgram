package com.example.Addition.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Addition.dto.AdditionRequest;
import com.example.Addition.dto.AdditionResponse;
// import com.example.Addition.dto.ApiResponse;
import com.example.Addition.service.AdditionService;


@RestController
@RequestMapping("/Addition")
public class AdditionController {

    private final AdditionService additionService;

    public AdditionController(AdditionService additionService) {
        this.additionService = additionService;
    }

    @PostMapping
    public AdditionResponse addNumber(@RequestBody AdditionRequest request)
    {
        return additionService.addNumber(request);
    }

    // @PostMapping
    // public ApiResponse<AdditionResponse> addNumber(@RequestBody AdditionRequest request) {

    //     AdditionResponse response = additionService.addNumber(request);

    //     return new ApiResponse<AdditionResponse>("success", response);
    // }
    


    


    

}
