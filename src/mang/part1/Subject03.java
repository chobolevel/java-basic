package mang.part1;

import java.util.ArrayList;
import java.util.List;

public class Subject03 {
    public static void main(String[] args) {

        Employee e1 = new Employee("MangKyu");
        Employee e2 = new Employee("MangKyu");
        List<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);

        int size = employees.stream().distinct().toList().size();
        System.out.println(size);

    }
}
