//Задача 11. Написать код, который создаст, а затем отловит ArrayIndexOutOfBoundsException.
public class Task_11 {
    public static void main(String[] args) {

        Integer[] arrays = {1, 2, 4, 5, 6, 7} ;

        try {
            int sum = 0;
            for(int i = 0; i <= 6; i++) {
                sum += arrays[i];
            }

        }
        catch (ArrayIndexOutOfBoundsException exp) {   //exp - переменная, в которой будет содержаться информация по
            // ошибке
            System.out.println("Error");
        }

        //После того как отловили ошибку, программа продолжает работать дальше.
        System.out.println("Program is working!!!");


    }
}
