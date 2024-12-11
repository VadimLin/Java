

public class Main {
    public static void main(String[] args) {

        Employee vova = new Employee("Иванов Владимир Иванович", "Продавец", "vova777@gmail.com",
                "+37533 555-23-23", 3000, 43);

        Employee vadim = new Employee("Иванов Вадим Иванович", "Тетсировщик", "vad777@gmail.com",
                "+37533 777-23-23", 5000, 29);
        Employee masha = new Employee("Иванова Мария Ивановна", "Программист",
                "masha777@gmail.com", "+37533 888-23-23", 7000, 32);
        Employee denis = new Employee("Иванов Денис Иванович", "Слесарь", "denis777@gmail.com",
                "+37533 555-27-27", 2500, 49);
        Employee katya = new Employee("Иванова Екатерина Ивановна", "Бухгалтер", "kate777@gmail.com",
                "+37533 555-29-29", 1500, 24);

        Employee[] employees = {vova, vadim, denis, masha, katya};

        for(Employee employee : employees) {
            if(employee.getAge() > 40) {
                System.out.println(employee.getInfo());;
            }
        }
    }
}