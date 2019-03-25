package com.java.codewars.current;

public class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void swap (Employee x, Employee y) {
        Employee temp = x;
        x = y;
        temp = y;
    }

    public void raiseSalary(double x){
        x = x * 3;
    }
}
