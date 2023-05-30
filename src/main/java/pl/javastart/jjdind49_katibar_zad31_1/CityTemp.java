package pl.javastart.jjdind49_katibar_zad31_1;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class CityTemp {
    private String name;
    private BigDecimal temp;
}
