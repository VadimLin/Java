package JavaCourse;
import java.util.Set;
import java.util.List;
import java.util.stream.Collectors;

public class Flomaster {
        final String color;
        final String taste;

        public Flomaster(String c, String t) {
            color = c;
            taste = t;
        }

        public String getTaste() {
            return taste;
        }
        public String getColor() {
            return color;
        }

        public static void main(String[] args) {
            Set<Flomaster> flomasterSet = Set.of(
                    new Flomaster("красный", "кислый"),
                    new Flomaster("зелёный", "кислый"),
                    new Flomaster("жёлтый", "кислый"),
                    new Flomaster("синий", "сладкий")
            );

            // сформировать список цветов кислых фломастеров
            List<String> sourColors = flomasterSet.stream()
                    .filter(f -> "кислый".equals(f.getTaste())) // фильтруем кислые фломастеры
                    .map(Flomaster::getColor) //преобразуем отфильтрованные объекты Flomaster в их цвета с помощью
            // Flomaster::getColor
                    .collect(Collectors.toList()); // собираем в список

            System.out.println(sourColors);

        }
}
