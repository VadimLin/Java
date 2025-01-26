package JavaCourse.Task_15;

public class Office {
    private double area;

    public double getArea() {
        return area;
    }

    private double pricePerSquareMeter;
    private int numberOfRooms;


    public Office(double area, double pricePerSquareMeter, int numberOfRooms) {
        this.area = area;
        this.pricePerSquareMeter = pricePerSquareMeter;
        this.numberOfRooms = numberOfRooms;
    }


    public double calculatePriceForSquareMeter() {
        return pricePerSquareMeter;
    }


    public int getNumbersOfRoom() {
        return numberOfRooms;
    }

    public void increaseArea(double additionalArea) {
        this.area += additionalArea;
    }

    public void rent() {
        System.out.println("Офис сдан в аренду.");
    }

    public void refurbish(String room) {
        System.out.println("Ремонт сделан в офисе : " + room);
    }
}
