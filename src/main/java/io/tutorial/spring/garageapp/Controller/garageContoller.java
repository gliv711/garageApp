package io.tutorial.spring.garageapp.Controller;

import io.tutorial.spring.garageapp.Model.Car;
import io.tutorial.spring.garageapp.Service.GarageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class garageContoller {
    @Autowired
    private GarageService garageService ;

    @RequestMapping("/cars")
    public List<Car> getCar(){
        return garageService.getCars() ;
    }

    @RequestMapping("/car/{id}")
    public Car getCar(@PathVariable long id){
        return garageService.getCar(id);
    }
@RequestMapping(method = RequestMethod.DELETE, value = "/car/{id}")
    public void deleteCar (@PathVariable long id ){
        garageService.deleteCar(id);
    }
@RequestMapping(method = RequestMethod.POST,value = "/cars")
    public void addCar(@RequestBody Car car){
        garageService.addCar(car);
    }
@RequestMapping(method = RequestMethod.PUT, value = "car/{id}")
    public void updateCar(@RequestBody Car car,@PathVariable long id){
        garageService.updateCar(car,id);
    }


}

