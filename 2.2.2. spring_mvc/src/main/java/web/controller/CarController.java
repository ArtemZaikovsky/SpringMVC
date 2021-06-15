package web.controller;

import Service.ServiceCarImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import model.Car;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class CarController {
    @GetMapping(value = "/cars")
    public String printCar(@RequestParam("count") int num, ModelMap model) {
        List<Car> carList = new ServiceCarImpl().findCars(num);
        model.addAttribute("carList", carList);
        return "Cars";
    }
}
