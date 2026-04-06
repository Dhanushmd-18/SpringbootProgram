package com.example.Addition.service;

import org.springframework.stereotype.Service;

import com.example.Addition.dto.AdditionRequest;
import com.example.Addition.dto.AdditionResponse;
import com.example.Addition.entity.AdditionEntity;
import com.example.Addition.repository.AdditionRepository;

@Service
public class AdditionService {
    private final AdditionRepository additionRepository;

    public AdditionService(AdditionRepository additionRepository) {
        this.additionRepository = additionRepository;
    }
    
    public AdditionResponse addNumber(AdditionRequest request)
    {
        double result=request.getNum1()+ request.getNum2();

        AdditionEntity entity=new AdditionEntity();
        entity.setNum1(request.getNum1());
        entity.setNum2(request.getNum2());
        entity.setResult(result);

         additionRepository.save(entity);

         return new AdditionResponse(result);


    }
}
