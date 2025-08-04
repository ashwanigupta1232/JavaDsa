package com.ak.Java8programs.EmployeeBased;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FindsecondHigestsalary {
    public static void main(String[] args) {


        List<Employee> employees = EmployeeData.EMPLOYEES;


        int maxEperince = employees.stream().mapToInt(Employee::getYearOfJoining)

                .max().orElse(0);

        List<Employee> mostexp = employees.stream()
                .filter(e -> e.getYearOfJoining() == maxEperince)
                .collect(Collectors.toList());
        List<Employee> sortedEmployees = employees.stream()
                .sorted(Comparator.comparingLong(Employee::getSalary))
                .collect(Collectors.toList());

        sortedEmployees.forEach(System.out::println);
    }
}