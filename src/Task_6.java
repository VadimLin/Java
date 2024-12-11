//Задача 6. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2

import java.util.Arrays;

public class Task_6 {
    public static void main(String[] args) {
        int[] ints = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };

        for(int i = 0; i < ints.length; i++) {
            if (ints[i] < 6) {
                ints[i] = ints[i] * 2;
            } else{

            }
        }
        System.out.println(Arrays.toString(ints));
    }
}
