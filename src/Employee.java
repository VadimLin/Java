//Задача 10. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст. При создании объекта
// данного класса все поля должны быть заполнены. Внутри класса «Сотрудник» написать метод, который выводит
// информацию об объекте в консоль. Создать массив из 5 сотрудников. С помощью цикла вывести информацию только о
// сотрудниках старше 40 лет.
public class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phone;
    private double salary;
    private int age;

    public Employee(String fullName, String position, String email, String phone, double salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public String getInfo() {
        return "ФИО - " + getFullName() +   "\nДолжность - " + getPosition() + "\nEmail - " + getEmail()
                + "\nТелефон - " + getPhone() + "\nЗарплата - " +  getSalary()  + "\nВозраст - " + getAge();
    }
}
