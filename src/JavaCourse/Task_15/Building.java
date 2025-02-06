package JavaCourse.Task_15;
/*
Разработать проект управления процессами на основе создания и реализации интерфейсов для предметной области Дом:
Возможности: построить дом; рассчитать цену за квадратный метр; узнать сколько комнат; увеличить площадь; сдавать дом
в аренду; сделать ремонт (в какой-либо комнате). Добавить специализированные методы для Дома, Офисного здания,
Торгового центра.
 */

public interface Building {

    double calculatePriceForSquareMeter();
    int getNumbersOfRoom();
    void increaseArea(double additionalArea);
    void rent();
    void refurbish(String room);

}
