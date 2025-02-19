package JavaCourse.Task_17;
import java.util.function.Function;

public class Lambda {
    public static void main(String[] args) {
        int a = 7;
        int b = 40;
        int c = 533;

        /** Лямбда-выражение для нахождения максимального из трех чисел. Используется функциональный интерфейс Function,
            который принимает один аргумент и возвращает значение. В данном случае, он принимает массив целых чисел
            (Integer[]) и возвращает одно целое число (Integer). Для нахождения наибольшего значения используется цикл. **/
        Function<Integer[], Integer> max = (nums) -> {
            int maxNumber = Integer.MIN_VALUE;;
            for (int number : nums) {
                if (number > maxNumber) {
                    maxNumber = number;
                }
            }
            return maxNumber;
        };


        /** переменная max, которая содержит лямбда-выражение, реализующее интерфейс Function. Метод apply является
         частью интерфейса Function и используется для применения функции к заданному аргументу. В данном случае,
         max.apply(new Integer[]{a, b, c}) вызывает лямбда-выражение, передавая ему массив, состоящий из трех целых
        чисел, которые мы хотим сравнить. **/
        int result = max.apply(new Integer[]{a, b, c});
        System.out.println("Наибольшее число: " + result);
    }
}
