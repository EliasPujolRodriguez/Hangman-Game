package model;

public enum Number {
    ONE("ONE", "UNO"),
    TWO("TWO", "DOS"),
    THREE("THREE", "TRES"),
    FOUR("FOUR", "CUATRO"),
    FIVE("FIVE", "CINCO"),
    SIX("SIX", "SEIS"),
    SEVEN("SEVEN", "SIETE"),
    EIGTH("EIGTH","OCHO"),
    NINE("NINE", "NUEVE"),
    TEN("TEN", "DIEZ"),
    ELEVEN("ELEVEN", "ONCE"),
    TWELVE("TWELVE", "DOCE"),
    THIRTHEEN("THIRTHEEN", "TRECE"),
    FOURTHEEN("FOURTHEEN", "CATORCE"),
    FIFTHEEN("FIFTHEEN", "QUINCE"),
    SIXTHEEN("SIXTHEEN", "DIECISÉIS"),
    SEVENTHEEN("SEVENTHEEN", "DIECISIETE"),
    EIGHTEEN("EIGHTEEN", "DIECIOCHO"),
    NINETEEN("NINETEEN", "DIECINUEVE"),
    TWENTY("TWENTY", "VEINTE"),
    TWENTY_ONE("TWENTY ONE", "VEINTIUNO"),
    TWENTY_TWO("TWENTY TWO", "VEINTIDOS"),
    THIRTHY("THIRTHY", "TREINTA"),
    FORTY("FORTY", "CUARENTA"),
    FIFTY("FIFTY", "CINCUENTA"),
    SIXTY("SIXTY", "SESENTA"),
    SEVENTY("SEVENTY", "SETENTA"),
    EIGHTY("EIGHTY", "OCHENTA"),
    NINETY("NINETY", "NOVENTA"),
    ONE_HUNDRED("ONE HUNDRED", "CIEN"),
    ONE_THOUSAND("ONE THOUSAND", "MIL");

    private final String numberCategory;
    private final String numberCategorySpTrn;
    
    private Number(String numberCategory, String numberCategorySpTrn) {
        this.numberCategory = numberCategory;
        this.numberCategorySpTrn = numberCategorySpTrn;
    }

    public String getNumber() {
        return numberCategory;
    }
    
    public String getNumberSpTranslation() {
        return numberCategorySpTrn;
    }

}
