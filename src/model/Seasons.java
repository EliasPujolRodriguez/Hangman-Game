package model;

public enum Seasons {
    SPRING("SPRING", "PRIMAVERA"),
    AUTUMN("AUTUMN", "OTOÑO"),
    SUMMER("SUMMER", "VERANO"),
    WINTER("WINTER", "INVIERNO"),
    RAIN("RAIN", "LLUVIA"),
    SNOW("SNOW", "NIEVE"),
    SUN("SUN", "SOL"),
    HEAT("HEAT", "CALOR"),
    MONDAY("MONDAY", "LUNES"),
    TUESDAY("TUESDAY", "MARTES"),
    WEDNESDAY("WEDNESDAY", "MIÉRCOLES"),
    FRIDAY("FRIDAY", "VIERNES"),
    SATURDAY("SATURDAY", "SÁBADO"),
    THURSDAY("THURSDAY", "JUEVES"),
    SUNDAY("SUNDAY", "DOMINGO");

    private final String seasonsCategory;
    private final String seasonsCategorySpTranslation;

    private Seasons(String seasonsCategory, String seasonsCategorySpTranslation) {
        this.seasonsCategory = seasonsCategory;
        this.seasonsCategorySpTranslation = seasonsCategorySpTranslation;
    }

    public String getSeason() {
        return seasonsCategory;
    }
    
    public String getSeasonSpTranslation() {
        return seasonsCategorySpTranslation;
    }
}
