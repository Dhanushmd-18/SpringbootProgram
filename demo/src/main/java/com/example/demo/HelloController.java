package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController

public class HelloController {

    // GET - Query Parameter
    @GetMapping("/")
    public String yoyo(@RequestParam String name, @RequestParam String college) {
        return "Welcome to Spring Boot " + name + " from " + college;
    }

    // GET - Query Parameter Calculator
    @GetMapping("/add")
    public String add(@RequestParam int num1, @RequestParam int num2) {

        int sum = num1 + num2;
        int mul = num1 * num2;
        int div = num1 / num2;

        return "Sum is " + sum + ", Product is " + mul + ", Division is " + div;
    }

    // GET - Path Variable
    @GetMapping("/add/{num1}/{num2}")
    public String cal(@PathVariable int num1, @PathVariable int num2) {

        int sum = num1 + num2;
        return "Sum is " + sum;
    }

    // POST - JSON RequestBody
    @PostMapping("/ad")
    public String addJson(@RequestBody Numbers numbers) {

        int sum = numbers.num1 + numbers.num2;
        return "Sum is " + sum;
    }

    // POST - JSON Student Form
    @PostMapping("/form")
    public String formExample(@RequestBody Student s) {

        return "Name: " + s.name + ", College: " + s.college;
    }

    // POST - Student Result JSON
    @PostMapping("/result")
    public String result(@RequestBody Student s) {

        int total = s.m1 + s.m2 + s.m3 + s.m4 + s.m5;
        double average = total / 5.0;

        String status;

        if (average >= 35) {
            status = "Pass";
        } else {
            status = "Fail";
        }

        return "Total = " + total + ", Average = " + average + ", Result = " + status;
    }

    // POST - Form Data Example
    @PostMapping("/formdata")
    public String formData(@RequestParam String name, @RequestParam String college) {

        return "Name: " + name + ", College: " + college;
    }
}

// Numbers Model
class Numbers {
    public int num1;
    public int num2;
}

// Student Model
class Student {
    public String name;
    public String college;

    public int m1;
    public int m2;
    public int m3;
    public int m4;
    public int m5;
}