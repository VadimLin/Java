package JavaCourse.Task_8;

public class Task_8 {
    public static void main(String[] args) {
        int[] numbers = {123, 121, 456, 789, 12321, 103, 112};
        int palindromeCount = 0; // Отслеживает количество найденных палиндромов
        int firstPalindrome = -1 ; // Значение по умолчанию, если ни одного палиндрома нет
        int secondPalindrome = -1; // Значение по умолчанию, если второго палиндрома нет

        // С помощью цикла for мы перебираем все числа в массиве и проверяем, является ли каждое число палиндромом,
        // используя метод isPalindrome.
        for (int number : numbers) {
            if (isPalindrome(number)) {
                palindromeCount++;
                if (palindromeCount == 1) {
                    firstPalindrome = number;
                    System.out.println("Первое число-палиндром: " + firstPalindrome);
                }
                if (palindromeCount == 2) {
                    secondPalindrome = number;
                    break; // Прерываем цикл, так как нашли второе палиндромное число
                }
            }
        }

        // Если второе число-палиндром найдено, выводим его на экран. Если нет, выводим сообщение об этом.
        if (secondPalindrome != -1) {
            System.out.println("Второе число-палиндром: " + secondPalindrome);
        } else {
            System.out.println("Второе число-палиндром не найдено.");
        }
    }

    //метод поиска палиндрома
    private static boolean isPalindrome(int number) {
        String str = String.valueOf(number); // конвертируем тип данных число в строку
        int len = str.length(); // находим длину строки
        for (int i = 0; i < len / 2; i++) {  // Двигаемся с обоих концов слова к серидине (условие продолжения цикла.
            // Здесь len предполагается как длина строки str. Цикл будет выполняться, пока i меньше половины длины
            // строки. Это делается для проверки симметричности (или палиндромности) строки, поскольку для этой
            // проверки достаточно сравнить только первую половину строки со второй половиной.)
            if (str.charAt(i) != str.charAt(len - 1 - i)) { // в этом условии происходит сравнение символов
                return false;
            }
        }
        return true;
        }

}
