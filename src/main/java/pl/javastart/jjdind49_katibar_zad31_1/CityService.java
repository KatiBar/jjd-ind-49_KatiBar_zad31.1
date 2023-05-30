package pl.javastart.jjdind49_katibar_zad31_1;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;

@Service
public class CityService {
    private String getUrl(String city) {
        return "api.openweathermap.org/data/2.5/weather?q="
                + city
                + "&lang=pl&units=metric&APPID=a4bc45ea49ad8bea10f67662e76fb421";
    }

    public CityTemp getCurrencyTemperature(String city) {
        RestTemplate restTemplate = new RestTemplate();

        try {
            String url = getUrl(city);
            CityResponseDto response = restTemplate.getForObject(url, CityResponseDto.class);
            String name = response.getName();
            BigDecimal temp = response.getMain().get("temp");

            return new CityTemp(name, temp);
        } catch (Exception e) {
            throw new CityNotAvailableException();
        }
    }
}
