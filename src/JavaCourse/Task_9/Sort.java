package JavaCourse.Task_9;
import java.util.List;
import java.util.ArrayList;

//Упорядочить и вывести числа в порядке возрастания (убывания) значений их длины.
public class Sort {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(123, 4567, 89, 12345, 678));

        // Преобразуем список чисел в список строк
        ArrayList<String> stringNumbers = new ArrayList<>();
        for (Integer number : numbers) {
            stringNumbers.add(String.valueOf(number));
        }

        // Сортируем список строк используя метод sort по возрастанию по длине цифр, используя лямбда-выражение, где
        // (s1 и s2 - это параметры),  а далее после  -> уже идет само выражение. (Если не использовать лямбда, тогда
        // необходимо было использовать интерфейс Comparator, у которого есть метод compare и перепределить его под
        // нашу необходимость)
        stringNumbers.sort((s1, s2) -> s1.length() - s2.length());

        System.out.println(stringNumbers);


        // Сортируем список строк по убыванию по длине цифр, используя лямбда-выражение

        stringNumbers.sort((s1, s2) -> s2.length() - s1.length());

        System.out.println(stringNumbers);
    }

}
