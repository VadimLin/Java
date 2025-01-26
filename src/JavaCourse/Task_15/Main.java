package JavaCourse.Task_15;

public class Main {
    public static void main(String[] args) {
        House villa = new House(40.5, 100, 3);
        System.out.println("Цена за квадратный метр дома: " + villa.calculatePriceForSquareMeter());
        System.out.println("Количество комнат в доме: " + villa.getNumbersOfRoom());
        double initialVillaArea = villa.getArea();
        villa.increaseArea(20);
        double increasedVillaArea = villa.getArea(); // Получение новой площади
        System.out.println("Площадь дома увеличена на: " + (increasedVillaArea - initialVillaArea) + " кв. м");
        villa.rent();
        villa.refurbish("гостиная");

        System.out.println("---------------------------------------------------------------------");

        Office office = new Office(200, 150, 7);
        System.out.println("Цена за квадратный метр офиса: " + office.calculatePriceForSquareMeter());
        System.out.println("Количество офисов: " + office.getNumbersOfRoom());
        double initialOfficeArea = office.getArea();
        office.increaseArea(50);
        double increasedOfficeArea = office.getArea(); // Получение новой площади
        System.out.println("Площадь офиса увеличена на: " + (increasedOfficeArea - initialOfficeArea) + " кв. м");
        office.rent();
        office.refurbish("на 1 этаже");

        System.out.println("---------------------------------------------------------------------");

        ShoppingCentre shop = new ShoppingCentre(400, 250, 35);
        System.out.println("Цена за квадратный метр магазина: " + shop.calculatePriceForSquareMeter());
        System.out.println("Количество магазинов: " + shop.getNumbersOfRoom());
        double initialShopArea = shop.getArea();
        shop.increaseArea(70);
        double increasedShopArea = shop.getArea(); // Получение новой площади
        System.out.println("Площадь магазина увеличена на: " + (increasedShopArea - initialShopArea) + " кв. м");
        shop.rent();
        shop.refurbish("на 1 этаже");

    }
}
