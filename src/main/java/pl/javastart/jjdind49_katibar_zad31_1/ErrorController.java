package pl.javastart.jjdind49_katibar_zad31_1;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ErrorController {
    @ExceptionHandler(CityNotAvailableException.class)
    public String handleException() {
        return "nodata";
    }
}
