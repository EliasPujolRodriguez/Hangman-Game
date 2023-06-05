package model;

public enum HouseNFourniture {
    GARAGE("GARAGE", "GARAJE"),
    CHIMNEY("CHIMNEY", "CHIMENEA"),
    ROOF("ROOF", "TECHO"),
    PATH("PATH", "SENDERO"),
    KITCHEN("KITCHEN", "COCINA"),
    LIVING_ROOM("LIVING ROOM", "CUARTO DE ESTAR"),
    BATHROOM("BATHROOM", "BAÑO"),
    BEDROOM("BEDROOM", "DORMITORIO"),
    DINING_ROOM("DINING ROOM", "COMEDOR"),
    OVEN("OVEN", "HORNO"),
    FIREPLACE("FIREPLACE", "CHIMENEA"),
    LETTERBOX("LETTERBOX", "BUZÓN"),
    DINING_TABLE("DINING TABLE", "COMEDOR"),
    TOILET("TOILET", "TAZA DE BAÑO"),
    SHAMPOO("SHAMPOO", "JABÓN"),
    BEDSISE_TABLE("BEDSIDE TABLE", "MESA DE NOCHE"),
    FORK("FORK", "TENEDOR"),
    BOOKSHELVES("BOOKSHELVES", "ESTANTE PARA LIBROS"),
    COOKER("COOKER", "HORNO"),
    BOOKCASE("BOOKCASE", "ESTANTERIA"),
    DRIVEWAY("DRIVEWAY", "ENTRADA DE AUTOS"),
    BATH("BATH", "BAÑO"),
    AIR_CONDITIONER("AIR CONDITIONER", "AIRE ACONDICIONADO"),
    LAMP("LAMP", "LÁMPARA"),
    ATTIC("ATTIC", "ÁTICO"),
    CURTAINS("CURTAINS", "CORTINAS"),
    NURSERY("NURSERY", "GUARDERIA"),
    BASEMENT("BASEMENT", "SÓTANO"),
    KNIFE("KNIFE", "CUCHILLO"),
    TAP("TAP", "GRIFO"),
    DRESSING_TABLE("DRESSING TABLE", "TOCADOR"),
    ARMCHAIR("ARMCHAIR", "SILLÓN"),
    TOWEL("TOWEL", "TOALLA DE BAÑO"),
    BED("BED", "CAMA"),
    SPOON("SPOON", "CUCHARA"),
    REFRIGERATOR("REFRIGERATOR", "REFRIGERADOR"),
    SOFA("SOFA", "SILLÓN"),
    MIRROR("MIRROR", "ESPEJO"),
    PILLOW("PILLOW", "ALMOHADA"),
    BALCONY("BALCONY", "BALCÓN"),
    SINK("SINK", "FREGADERO"),
    CLOCK("CLOCK", "RELOJ"),
    SOAP("SOAP", "JABÓN"),
    WASHBASIN("WASHBASIN", "LAVAMANOS"),
    SHEET_BLANKET("SHEET BLANKET", "SÁBANAS"),
    STAIRS("STAIRS", "ESCALERAS"),
    GLASS_CUP("GLASS CUP", "COPA DE VIDRIO"),
    TOILET_PAPER("TOILET PAPER", "TOALLA DE BAÑO"),
    COFEE_TABLE("COFFEE TABLE", "MESA DE NOCHE"),
    CARPET("CARPET", "ALFOMBRA"),
    WARDROBE("WARDROBE", "GUARDAROPA"),
    WALL("WALL", "PARED"),
    HALL("HALL", "CORREDOR"),
    RUG("RUG", "ALFOMBRA"),
    STUDY("STUDY", "PIEZA DE ESTUDIO"),
    DESK("DESK", "MESA"),
    GARDEN("GARDEN", "JARDIN"),
    POT("POT", "MACETA"),
    PICTURE("PICTURE", "FOTO/CUADRO"),
    FAN("FAN", "SARTEN"),
    WASHING_MACHINE("WASHING MACHINE", "LAVAPLATOS"),
    MICROWAVE("MICROWAVE", "HORNO DE MICROONDAS"),
    HOME("HOME", "HOGAR/CASA"),
    CHAIR("CHAIR", "SILLA"),
    LAUNDRY_ROOM("LAUNDRY ROOM", "CUARTO DE LAVADO");

    private final String houseFourCategory;
    private final String houseFourCategoryToSpn;

    private HouseNFourniture(String houseFourCategory, String houseFourCategoryToSpn) {
        this.houseFourCategory = houseFourCategory;
        this.houseFourCategoryToSpn = houseFourCategoryToSpn;
    }

    public String getHouseNFourniture() {
        return houseFourCategory;
    }
    
    public String getHouseFrSpTranslation(){
        return houseFourCategoryToSpn;
    }

   
}