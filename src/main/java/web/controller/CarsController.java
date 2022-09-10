package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.service.CarService;
import javax.servlet.http.HttpServletRequest;

@Controller
public class CarsController {
    @GetMapping(value = "/cars")
    public String printCars(HttpServletRequest request, ModelMap model)  {
        if (request.getParameter("count") == null) {
            model.addAttribute("cars", CarService.CarCount(5));
        }else if (Integer.parseInt(request.getParameter("count")) > 5) {
            model.addAttribute("cars", CarService.CarCount(5));
        }
        else {
            model.addAttribute("cars", CarService.CarCount(Integer.parseInt(request.getParameter("count"))));
        }
        return "cars";
    }


}