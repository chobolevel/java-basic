package mang.part4;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.IntStream;
import java.util.stream.Stream;

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

        Arrays.asList("a", "b", "c", "d", "e")
                .parallelStream()
                .filter(s -> {
                    System.out.format("filter: %s [%s]\n", s, Thread.currentThread().getName());
                    return true;
                })
                .map(s -> {
                    System.out.format("map: %s [%s]\n", s, Thread.currentThread().getName());
                    return s.toUpperCase();
                })
                .sorted((s1, s2) -> {
                    System.out.format("sort: %s <> %s [%s]\n", s1, s2, Thread.currentThread().getName());
                    return s1.compareTo(s2);
                })
                .forEach(s -> System.out.format("forEach: %s [%s]\n", s, Thread.currentThread().getName()));

    }
}
