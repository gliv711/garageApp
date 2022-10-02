package io.tutorial.spring.garageapp.Service;

import io.tutorial.spring.garageapp.Model.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class GarageService {
ArrayList<Car> cars = new ArrayList<>(Arrays.asList(
        new Car(1,"Clio","Renault",1998, Car.Color.GRAY),
        new Car(2,"106","Peugeot",1988, Car.Color.WHITE),
        new Car(3,"Megane","Renault",2004, Car.Color.GRAY)

));

public List<Car> getCars(){
    return cars;

}
public Car getCar(long id ){
    return cars.stream().filter(car -> car.getId() == id).findFirst().orElse(null);
}

public void deleteCar(long id){
    cars.removeIf(car -> car.getId()==id );

}
public void addCar(Car car){
    cars.add(car);
}
public void updateCar(Car car , long id ){
    cars.forEach(car1 ->
    {
        if(car1.getId()== id ){
            cars.set(cars.indexOf(car1),car );
        }
    });

}


}
