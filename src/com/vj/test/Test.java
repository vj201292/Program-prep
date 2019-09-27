package com.vj.test;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

    private static Employee[] arrayOfEmp = {
            new Employee(1, "Jeff Bezos", 100000.0),
            new Employee(2, "Bill Gates", 200000.0),
            new Employee(3, "Mark Zuckerberg", 300000.0)
    };

    public static void main(String[] args) {
        Stream<Employee> arrayOfEmp = Stream.of(Test.arrayOfEmp);
       /* arrayOfEmp.filter(employee -> employee.getSalary() > 100000)
                .collect(Collectors.toList())
                .forEach(System.out::println);*/


        arrayOfEmp.map(employee -> employee.getId()+1)
                  .collect(Collectors.toList())
                  .forEach(System.out::println);





    }
}
