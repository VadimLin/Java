package JavaCourse.Task_3;// 3 Задача. Написать программу вычисляющую площадь треугольника по трем сторонам


// решить надо с учетом сторон треугольника (они не должны быть отрицательными и тд, стороны должны образовывать треугольник)

public class Task_3 {
    public static void main(String[] args) {
        double side1 = 15;
        double side2 = 16;
        double side3 = 17;
        if (isValidTriangle(side1, side2, side3)) {
            double area = getSqrt(side1, side2, side3);
            System.out.println("Площадь треугольника: " + area);
        } else {
            System.out.println("Заданные стороны не образуют треугольник.");
        }
    }

    // Метод проверки, что стороны образуют треугольник
    public static boolean isValidTriangle(double side1, double side2, double side3) {
        return (side1 > 0 && side2 > 0 && side3 > 0) && (side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1);
    }

    // Метод вычисления площади треугольника
    public static double getSqrt(double side1, double side2, double side3) {
        double halfPerimetr = (side1 + side2 + side3)/2; // вычисление полупериметра
        // вычисление площади треугольника
        return Math.sqrt(halfPerimetr * (halfPerimetr - side1) * (halfPerimetr - side2) * (halfPerimetr - side3));

    }
}
