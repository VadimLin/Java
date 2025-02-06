package JavaCourse.Task_16;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(); // Создаем пусто массив студентов и ниже добавляем через метод add
        students.add(new Student("Michael", 53, 9.2));
        students.add(new Student("John", 53, 9.5));
        students.add(new Student("Alice", 29, 9.0));
        students.add(new Student("Bob", 24, 7.5));
        students.add(new Student("Jack", 41, 8.5));
        students.add(new Student("Olga", 19, 7.0));

    List<Student> filteredAndSortedStudents = students.stream() // используем stream
            .filter(student -> student.getGrade() > 8)  // отфильтровываем только тех студентов, у которых оценка выше 8
            .sorted(Comparator.comparing(Student::getName)) // сортируем вывод по имени. Два подряд двоеточия означает
            // то, что указываем необходимость ссылаться на метод getName
            .collect(Collectors.toList()); // собираем полученный поток в новый список List

    filteredAndSortedStudents.forEach(System.out::println); // выводим отфильтрованный и отсортированный список
    }
}
