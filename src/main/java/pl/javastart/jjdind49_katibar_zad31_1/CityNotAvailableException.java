package pl.javastart.jjdind49_katibar_zad31_1;

public class CityNotAvailableException extends RuntimeException {

    public CityNotAvailableException() {
        super("Nie znaleziono miasta o podanej nazwie");
    }

}
