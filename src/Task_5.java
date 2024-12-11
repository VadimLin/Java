import java.util.Arrays;

// 5 Задача. Задать целочисленный массив, состоящий из элементов 0 и 1.
// Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
public class Task_5 {
    public static void main(String[] args) {
        int[] ints = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };

        int replaceValue0 = 0;

        int replaceValue1 = 1;

        for(int i = 0; i < ints.length; i++) {
            if(ints[i] == replaceValue0 ){
                ints[i] = replaceValue1;
            } else if(ints[i] == replaceValue1 ){
                ints[i] = replaceValue0;
            }
        }
        System.out.println(Arrays.toString(ints)); //преобразование массива в строку
    }
}
