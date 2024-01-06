package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarService {
    private final List<Car> listOfCars = new ArrayList<>();

    {
        listOfCars.add(new Car("Mercedes", 600, "black"));
        listOfCars.add(new Car("BMW", 5, "deep blue"));
        listOfCars.add(new Car("Audi", 4, "white"));
        listOfCars.add(new Car("Peugeot", 405, "gray"));
        listOfCars.add(new Car("Mini-Cooper", 500, "red"));
    }

    public List<Car> getAllCars() {
        return listOfCars;
    }

    public List<Car> countOfCars(int returnCountCars) {
        List<Car> cars = getAllCars();
        if (returnCountCars >= 5) {
            return cars;
        } else {
            return cars.stream().limit(returnCountCars).collect(Collectors.toList());
        }
    }

}
