package mang.part4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class StudentMain {
    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student(80, 90, 75),
                new Student(70, 100, 75),
                new Student(85, 90, 85),
                new Student(80, 100, 90)
        );

        students.stream().flatMapToInt(student ->
                IntStream.of(student.getKor(), student.getEng(), student.getMath()))
                .average()
                .ifPresent(avg -> System.out.println(Math.round(avg * 10) / 10.0));


        IntStream.range(1, 4).reduce(10, (a, b) -> Integer.sum(a, b));

    }
}
