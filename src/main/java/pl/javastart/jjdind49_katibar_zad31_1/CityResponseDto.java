package pl.javastart.jjdind49_katibar_zad31_1;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Map;

@Data
@AllArgsConstructor
public class CityResponseDto {
    private Map<String, BigDecimal> coord;
    private Wheather wheather;
    private String base;
    private Map<String, BigDecimal> main;
    private long visibility;
    private Map<String, BigDecimal> wind;
    private Map<String, BigDecimal> clouds;
    private long dt;
    private int timezone;
    private long id;
    private String name;
    private int cod;

}

//{
//        "coord": {
//        "lon": 19.9167,
//        "lat": 50.0833
//        },
//        "weather": [
//        {
//        "id": 800,
//        "main": "Clear",
//        "description": "bezchmurnie",
//        "icon": "01n"
//        }
//        ],
//        "base": "stations",
//        "main": {
//        "temp": 14.09,
//        "feels_like": 13.17,
//        "temp_min": 12.55,
//        "temp_max": 14.84,
//        "pressure": 1018,
//        "humidity": 62
//        },
//        "visibility": 10000,
//        "wind": {
//        "speed": 2.06,
//        "deg": 20
//        },
//        "clouds": {
//        "all": 0
//        },
//        "dt": 1685303579,
//        "sys": {
//        "type": 1,
//        "id": 1701,
//        "country": "PL",
//        "sunrise": 1685241579,
//        "sunset": 1685298948
//        },
//        "timezone": 7200,
//        "id": 3094802,
//        "name": "Kraków",
//        "cod": 200
//        }