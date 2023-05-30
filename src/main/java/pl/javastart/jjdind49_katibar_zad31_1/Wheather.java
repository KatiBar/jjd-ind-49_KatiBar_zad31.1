package pl.javastart.jjdind49_katibar_zad31_1;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Wheather {
    private int id;
    private String main;
    private String description;
    private String icon;
}


//"weather": [
//        {
//        "id": 800,
//        "main": "Clear",
//        "description": "bezchmurnie",
//        "icon": "01n"
//        }
//        ],