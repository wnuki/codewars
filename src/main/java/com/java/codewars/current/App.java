package com.java.codewars.current;

public class App {

    public static void main(String[] args) {
        Employee employee1 = new Employee("AAAA");
        Employee employee2 = new Employee("BBBB");

        Employee.swap(employee1, employee1);
        System.out.println(employee1.getName());
        System.out.println(employee2.getName());

        double percent = 10;
        employee1.raiseSalary(percent);
        System.out.println(percent);

    }
}
