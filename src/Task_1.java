//1 Задача. Написать метод который вычисляет факториал введенного целого числа
public class Task_1 {
    public static void main(String[] args) {
        System.out.println(getFactorial(5));
    }
    public static int getFactorial(int f) {
        int result = 1; // начинается с 1, так как факториал 0 равен 1
        for(int i = 1; i <= f; i++) { // i равно 1, так как вычисление факториала начинается с первого числа
            result = result * i;
        }
        return result;
    }
}
