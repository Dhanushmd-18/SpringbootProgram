package com.example.Addition.dto;

public class AdditionResponse {

    private double result;

    // ✅ ADD THIS CONSTRUCTOR
    public AdditionResponse(double result) {
        this.result = result;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
}