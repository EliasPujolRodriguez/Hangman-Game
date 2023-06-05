package model;

import java.util.ArrayList;

public enum Color {
    WHITE("WHITE", "BLANCO"),
    BLACK("BLACK", "NEGRO"),
    ORANGE("ORANGE", "NARANJA"),
    MAROON("MAROON", "GRANATE"),
    RED("RED", "ROJO"),
    YELLOW("YELLOW", "AMARILLO"),
    LIME_GREEN("LIME GREEN", "VERDE LIMA"),
    SALMON("SALMON", "SALMON"),
    GREEN("GREEN", "VERDE"),
    SKY_BLUE("SKY BLUE", "CIELO AZUL"),
    CRIMSON("CRIMSON", "CARMESÍ"),
    GREY("GREY", "GRIS"),
    AQUA("AQUA", "AGUA"),
    PURPLE("PURPLE", "MORADO"),
    MUSTARD("MUSTARD", "MOSTAZA"),
    PEACH("PEACH", "DURAZNO"),
    VIOLET("VIOLET", "VIOLETA"),
    MAGENTA("MAGENTA", "MAGENTA"),
    CORAL("CORAL", "CORAL"),
    SAFRON("SAFRON", "AZAFRÁN"),
    BROWN_PINK("BROWN PINK", "MARRÓN ROSA"),
    TAN("TAN", "BRONCEADO"),
    TEAL("TEAL", "VERDE"),
    NAVY_BLUE("NAVY BLUE", "AZUL MARINO"),
    TURQUOISE("TURQUOISE", "TURQUEDA"),
    LAVENDER("LAVENDER", "LAVANDA"),
    BEIGE("BEIGE", "BEIGE"),
    LEMON_YELLOW("LEMON YELLOW", "LIMON AMARILLO"),
    GRAPE_VINE("GRAPE VINE", "VID DE UVA"),
    FUCHSIA("FUCHSIA", "FUCSIA"),
    DARK_GREEN("DARK GREEN", "VERDE OSCURO"),
    CHARCOAL("CHARCOAL", "CARBÓN"),
    BRONZE("BRONZE", "BRONCE"),
    RUST("RUST", "ÓXIDO"),
    CREAM_MAUVE("CREAM MAUVE", "MALVA CREMA"),
    SILVER("SILVER", "PLATA"),
    OLIVE("OLIVE", "OLIVA"),
    CYAN("CYAN", "CIAN"),
    AZURE("AZURE", "AZÚL CELESTE"),
    RUBY("RUBY", "RUBÍ"),
    MINT("MINT", "MENTA"),
    PEARL("PEARL", "PERLA"),
    IVORY("IVORY", "MARFIL"),
    TANGERINE("TANGERINE", "MANDARINA"),
    CHERRY_RED("CHERRY RED", "ROJO CEREZA"),
    GARNET("GARNET", "GRANATE"),
    EMERALD("EMERALD", "ESMERALDA"),
    SAPPHIRE("SAPPHIRE", "ZAFIRO"),
    ROSEWOOD("ROSEWOOD", "PALO DE ROSA"),
    LILAC("LILAC", "LILA"),  
    ARTIC_BLUE("ARTIC BLUE", "AZÚL ÁRTICO"),
    PISTA_GREEN("PISTA GREEN", "VERDE PISTA"),
    COFEE_BROWN("COFFEE BROWN", "CAFÉ MARRÓN"),
    UMBER("UMBER", "OCRE OSCURO"),
    BRUNETTE("BRUNETTE", "MORENA"),
    MOCHA("MOCHA", "MOCA"),
    ASH("ASH", "CENIZA"),
    JET_BLACK("JET BLACK", "NEGRO AZABACHE"),
    AMBER_SEA_GREEN("AMBER SEA GREEN", "AMBAR VERDE MAR");

    private final String colorCategory;
    private final String colorCategorySpTranslation;
    
    private Color(String colorCategory, String colorCategorySpTranslation) {
        this.colorCategory = colorCategory;
        this.colorCategorySpTranslation = colorCategorySpTranslation;
    }

    public String getColor() {
        return colorCategory;
    }
    
    public String getColorSpTrns() {
        return colorCategorySpTranslation;
    }
}
