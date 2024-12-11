import java.util.Arrays;

//Вывести элементы массива в обратном порядке.
public class Task_7 {
    public static void main(String[] args) {
        int[] ints = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };

        //Исходный вывод
        for(int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
        System.out.println("--------------------------------------------------");

        //Обратный вывод, где по условию начинаем с последнего значения в массиве и уменьшаем на 1 с каждой итерацией

        for(int i = ints.length - 1; i >= 0; i--) {
            System.out.println(ints[i]);
        }

    }
}
