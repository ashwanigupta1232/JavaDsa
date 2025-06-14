package com.ak.Java8programs;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Student {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name= name;

    }

    public int getId() {
        return id;
    }

    public String getName(){
        return name;
    }
}
public class ListToMap {
    public static void main(String[] args) {


        List<Student> ls =  new ArrayList<>();
        ls.add(new Student(2,"ak"));
        ls.add(new Student(3,"ck"));
        ls.add(new Student(4,"dk"));

        Map<Integer , String> hm =  ls.stream().
                collect(Collectors.toMap(Student::getId ,Student::getName));

        System.out.println(hm);
    }
}
