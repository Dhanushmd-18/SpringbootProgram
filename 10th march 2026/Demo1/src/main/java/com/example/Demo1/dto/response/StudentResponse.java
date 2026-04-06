package com.example.Demo1.dto.response;

public class StudentResponse {
    private String name;
    private int rollnumber; 
    private int totalMarks;
    private double percentage;
    private String result;
    public StudentResponse(String name, int rollnumber, int totalMarks, double percentage, String result) {
        this.name = name;
        this.rollnumber = rollnumber;
        this.totalMarks = totalMarks;
        this.percentage = percentage;
        this.result = result;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getRollnumber() {
        return rollnumber;
    }
    public void setRollnumber(int rollnumber) {
        this.rollnumber = rollnumber;
    }
    public int getTotalMarks() {
        return totalMarks;
    }
    public void setTotalMarks(int totalMarks) {
        this.totalMarks = totalMarks;
    }
    public double getPercentage() {
        return percentage;
    }
    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }
    public String getResult() {
        return result;
    }
    public void setResult(String result) {
        this.result = result;
    }
    
}
