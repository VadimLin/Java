package JavaCourse.Task_14;

public class LastWord {
    public static void main(String[] args) {
        String s = "Строка из слов и пробелов";
        int length = lengthOfLastWord(s); // используем для хранения длины последнего слова.
        System.out.println("Длина последнего слова: " + length);
    }

    // статичный метод поиска длины последнего слова
    public static int lengthOfLastWord(String s) {
        int length = 0;
        boolean foundWord = false; // переменная, которая указывает на то, найдено ли последнее слово

        // Проходим по строке с конца
        for (int i = s.length() - 1; i >= 0; i--) {
            char currentChar = s.charAt(i);

            // Если символ не пробел
            if (currentChar != ' ') {
                foundWord = true;
                length++; // Увеличиваем длину последнего слова
            } else if (foundWord) {
                // Если мы уже нашли слово и наткнулись на пробел
                break;
            }
        }

        return length;
    }
}
