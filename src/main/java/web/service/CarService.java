package web.service;

import web.model.CarModel;

import java.util.ArrayList;
import java.util.List;

public class CarService {
    public static List<CarModel> CarCount(int count) {
        List<CarModel> cars = new ArrayList<>();
        cars.add(new CarModel("Ford", 2000, 1));
        cars.add(new CarModel("Toyota", 2015, 1));
        cars.add(new CarModel("Lada", 2010, 10));
        cars.add(new CarModel("Honda", 2011, 15));
        cars.add(new CarModel("Jeep", 2008, 3));
        if (count == 0) {
            return cars;
        } else {
            return cars.subList(0, count);
        }
    }
}
