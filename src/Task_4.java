//4 Задача. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит
// в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false
public class Task_4 {
    public static void main(String[] args) {
        System.out.println(getCount(3, 8));
        System.out.println(getCount(4, 4));
    }
    public static boolean getCount(int a, int b) {

        if ((a + b) >= 10 && (a + b) <= 20) {
            return true;
        } else {
            return false;
        }
    }
}
