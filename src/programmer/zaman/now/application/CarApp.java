package programmer.zaman.now.application;

import programmer.zaman.now.data.Avanza;
import programmer.zaman.now.data.Car;

public class CarApp {
    public static void main(String[] args) {
        // polymorphism
        Car car = new Avanza();
        System.out.println(car.getTire());
        car.drive();
    }
}
