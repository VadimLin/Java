package JavaCourse.Task_16;

public class Student {

    private int age;
    private String name;
    private double grade;

    public Student(String name, int age, double degree) {
        this.age = age;
        this.name = name;
        this.grade = degree;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }

    // Переопределяем метод toString для удобного в дальнейшем вывода информации по студентам
    public String toString() {
        return "Student{name='" + name + "', age=" + age + ", grade=" + grade + "}";
    }
}
