package com.ak.Java8programs.EmployeeBased;

import java.util.List;
import java.util.Map;

import java.util.stream.Collectors;

public class CountEmployeeGender {


    public static void main(String[] args) {
        List<Employee> employees = EmployeeData.EMPLOYEES;

        Map<String ,Long> count  =  employees.stream().filter(e -> e.getAge()<20)
                .collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));

        count.forEach((gender, coun)-> System.out.println(gender +" : "+coun));

    // employee by city
        Map<String, List<Employee>> groupedByCity = employees.stream()
                .collect(Collectors.groupingBy(Employee::getCity));

        groupedByCity.forEach((city, empList) -> {
            System.out.println("City: " + city);
            empList.forEach(System.out::println);
        });



    }
}
