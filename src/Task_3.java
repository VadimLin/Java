// 3 Задача. Написать программу вычисляющую площадь треугольника по трем сторонам
public class Task_3 {
    public static void main(String[] args) {
        Task_3 triangle = new Task_3(3, 5, 8);

        System.out.println(triangle.getSum());
    }

    private int side1;
    private int side2;
    private int side3;

    public Task_3(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public int getSide1() {
        return side1;
    }


    public int getSide2() {
        return side2;
    }


    public int getSide3() {
        return side3;
    }

    public int getSum() {
        return (side1 + side2 + side3)/2;
    }
}
