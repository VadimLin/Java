//1 Задача. Написать метод который вычисляет факториал введенного целого числа
public class Task_1 {
    public static int getFactorial(int f) {
        int result = 1;
        for(int i = 0; i <= f; i++) {
            result = result * i;
        }
        return result;
    }

    public static void main(String[] args) {
            Task_3 triangle = new Task_3(3, 5, 8);

            System.out.println(triangle.getSum());
    }
}
