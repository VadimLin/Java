package JavaCourse.Task_15;

import org.w3c.dom.ls.LSOutput;

public class House implements Building {
    private double area;

    public double getArea() {
        return area;
    }

    private double pricePerSquareMeter;
    private int numberOfRooms;


    public House(double area, double pricePerSquareMeter, int numberOfRooms) {
        this.area = area;
        this.pricePerSquareMeter = pricePerSquareMeter;
        this.numberOfRooms = numberOfRooms;
    }

    @Override
    public double calculatePriceForSquareMeter() {
        return pricePerSquareMeter;
    }

    @Override
    public int getNumbersOfRoom() {
        return numberOfRooms;
    }

    @Override
    public void increaseArea(double additionalArea) {
        this.area += additionalArea;
    }

    @Override
    public void rent() {
        System.out.println("Дом сдан в аренду.");
    }

    @Override
    public void refurbish(String room) {
        System.out.println("Ремонт сделан в комнате : " + room);
    }
}
