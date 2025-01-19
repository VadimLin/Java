package JavaCourse.Task_13;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Period {
    public static void main(String[] args) {
        // Указываем начальную дату, используя статический метод класса LocalDate
        LocalDate startDate = LocalDate.of(2025, 1, 6); // 06 января 2025
        // Задаем конечную дату, используя метод plusDays
        LocalDate endDate = startDate.plusDays(6); // 12 января 2025

        // Форматируем вывод, используя класс DateTimeFormatter и задав шаблон
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM");
        String formattedStartDate = startDate.format(formatter); // применяем выбранный шаблон ранее для начальной даты
        String formattedEndDate = endDate.format(formatter); // применяем выбранный шаблон ранее для конечной даты

        // Выводим результат
        System.out.println(formattedStartDate + " - " + formattedEndDate);
    }

}
