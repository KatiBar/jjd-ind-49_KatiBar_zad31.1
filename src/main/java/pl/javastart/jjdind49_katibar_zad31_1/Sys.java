package pl.javastart.jjdind49_katibar_zad31_1;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Sys {
    private int type;
    private int id;
    private String country;
    private long sunrise;
    private long sunset;
}

//"sys": {
//        "type": 1,
//        "id": 1701,
//        "country": "PL",
//        "sunrise": 1685241579,
//        "sunset": 1685298948
//        },
