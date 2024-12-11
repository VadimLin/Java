//2 Задача. Посчитать сумму цифр заданного числа
public class Task_2 {
    public static void main(String[] args) {

        String digits = "152";
        String[] arr = digits.split(""); /* означает, что строка digits будет разделена на части по пробелу, и
        результат будет храниться в массиве строк*/
        int result = 0;

        for(int i = 0; i <arr.length; i++) {
            result += Integer.parseInt(arr[i]); // преобразование строки в число
        }
        System.out.println(result);
    }
}
