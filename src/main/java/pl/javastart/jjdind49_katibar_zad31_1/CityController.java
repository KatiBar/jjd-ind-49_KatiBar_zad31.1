package pl.javastart.jjdind49_katibar_zad31_1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@Controller
public class CityController {
    private final CityService cityService;

    public CityController(CityService cityService) {
        this.cityService = cityService;
    }


    @GetMapping("/")
    String home() {
        return "temp";
    }

    @GetMapping("/temp")
    String getHome() {
        return "temp";
    }

    @PostMapping("/temp")
    @ResponseBody
    String getTemperatureInfo(@RequestParam String city) {
            CityTemp currencyTemperature = cityService.getCurrencyTemperature(city);
            String name = currencyTemperature.getName();
            BigDecimal temp = currencyTemperature.getTemp();
            return name + " " + temp;

    }

//    @GetMapping("/index")
//    String getNote(@RequestParam String city, Model model) {
//        CityTemp currencyTemperature = cityService.getCurrencyTemperature(city);
////        String name = currencyTemperature.getName();
////        BigDecimal temp = currencyTemperature.getTemp();
//        model.addAttribute("cityTemp", currencyTemperature);
//        return "index";
//    }
}
