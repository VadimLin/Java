package JavaCourse.Task_12;

public class Extraction {
    public static void main(String[] args) {
        String text = "Август, Сумма расходов равна, 0 ₽, Сумма доходов равна, 0 ₽";

        // Извлечение месяца
        int monthEndIndex = text.indexOf(","); // Находим индекс первого запятой с помощью indexOf
        String month = text.substring(0, monthEndIndex); // Извлекаем месяц с помощью метода substring

        // Извлечение суммы расходов
        int expensesStartIndex = text.indexOf("равна, ") + "равна, ".length(); //Находим индекс начала суммы расходов,
        // добавляя длину строки "равна, " к индексу, найденному с помощью indexOf.
        int expensesEndIndex = text.indexOf(" ₽", expensesStartIndex); // Находим индекс конца суммы расходов,
        // используя indexOf(" ₽", expensesStartIndex).
        String expenses = text.substring(expensesStartIndex, expensesEndIndex); //Извлекаем сумму расходов с помощью
        // метода substring

        // Извлечение суммы доходов
        int incomeStartIndex = text.indexOf("равна, ", expensesEndIndex) + "равна, ".length(); //Находим индекс
        // начала суммы доходов, добавляя длину строки "равна, " к индексу, найденному с помощью indexOf.
        int incomeEndIndex = text.indexOf(" ₽", incomeStartIndex); // Находим индекс конца суммы доходов,
        // используя indexOf(" ₽", expensesStartIndex).
        String income = text.substring(incomeStartIndex, incomeEndIndex); //Извлекаем сумму доходов с помощью
        // метода substring

        // Вывод значений в консоль
        System.out.println("Месяц: " + month);
        System.out.println("Сумма расходов: " + expenses);
        System.out.println("Сумма доходов: " + income);
    }
}
