package com.example.add.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins ="*")
public class AddController {
    
    @PostMapping("/add")
      public Result add(@RequestBody Numbers numbers) {
        int sum = numbers.getA() + numbers.getB();
        return new Result(sum);
    }

    // Request class
    static class Numbers {
        private int a;
        private int b;

        public int getA() {
            return a;
        }

        public void setA(int a) {
            this.a = a;
        }

        public int getB() {
            return b;
        }

        public void setB(int b) {
            this.b = b;
        }
    }

    // Response class
    static class Result {
        private int result;

        public Result(int result) {
            this.result = result;
        }

        public int getResult() {
            return result;
        }
    }
}
    

