package JavaCourse.Task_9;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

//Упорядочить и вывести числа в порядке возрастания (убывания) значений их длины.
public class Sort {

    public static void main(String[] args) {
        int[] ints = {123, 4567, 89, 12345, 678, 9};

        List<Integer> numbers = new ArrayList<>(); // Объявление

        // Преобразуем список чисел в список строк
        for (Integer number : ints) {
            int eachLength = String.valueOf(number).length();
            numbers.add(eachLength);

        }

        //Сортировка по возрастанию, используя метод sort класса Collections, который сортирует элементы в указанной
        // коллекции numbers. По умолчанию он сортирует элементы в порядке возрастания.
        Collections.sort(numbers);
        System.out.println("Сортировка по возрастанию " + numbers);

        //Сортировка по убыванию, используя метод reverseOrder, который возвращает компаратор, который сортирует
        // элементы в порядке убывания (компаратор — это интерфейс, который используется для определения порядка
        // сортировки объектов.)
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println("Сортировка по убыванию " + numbers);
    }

}
