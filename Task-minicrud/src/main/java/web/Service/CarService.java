package web.Service;

import org.springframework.stereotype.Service;
import web.controller.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {
    private final List<Car> carList;

    public CarService() {
        carList = new ArrayList<>();
        carList.add(new Car("BMW", "M550I", 2021));
        carList.add(new Car("MERCEDES-BENZ", "CLS55AMG", 2009));
        carList.add(new Car("BMW", "M5", 2021));
        carList.add(new Car("LADA", "GRANTA SPORT", 2024));
        carList.add(new Car("AUDI", "S4", 1998));
    }

    public List<Car> getCars(int count) {
        if (count >= 5) {
            return new ArrayList<>(carList);
        }
        return carList.subList(0, Math.min(count, carList.size()));
    }
}
