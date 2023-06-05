package model;

public enum MusicalInstrument {
    GUITAR("GUITAR", "GUITARA"),
    SAXOPHONE("SAXOPHONE", "SAXOFÓN"),
    ACCORDION("ACCORDION", "ACORDIÓN"),
    ACOUSTIC_GUITAR("ACOUSTIC GUITAR", "GUITARA ACÚSTICA"),
    BANJO("BANJO", "BANJO"),
    BASS("BASS", "BAJO"),
    BASS_GUITAR("BASS GUITAR", "BAJO"),
    BUGLE("BUGLE", "CORNETA"),
    ORGAN("ORGAN", "ORGANO"),
    CELLO("CELLO", "VIOLONCHELO"),
    MARACAS("MARACAS", "MARACAS"),
    PAN_FLUTES("PAN FLUTES", "FLAUTAS DE PAN"),
    PIANO("PIANO", "PIANO"),
    RECORDER("RECORDER", "GRABADORA"),
    CLARINET("CLARINET", "CLARINETE"),
    CYMBALS("CYMBALS", "PLATILLOS"),
    ARMONICA("ARMONICA", "ARMONICA"),
    KEYBOARD("KEYBOARD", "TECLADO"),
    SITAR("SITAR", "SITAR"),
    TRIANGLE("TRIANGLE", "TRIÁNGULO"),
    TAMBOURINE("TAMBOURINE", "PANDERETA"),
    UKULELE("UKULELE", "UKULELE"),
    VIOLIN("VIOLIN", "VIOLÍN"),
    TRUMPET("TRUMPET", "TROMPETA"),
    TROMBONE("TROMBONE", "TROMBÓN"),
    ELECTRIC_GUITAR("ELECTRIC GUITAR", "GUITARRA ELECTRICA"),
    FLUTE("FLUTE", "FLAUTA"),
    TUBA("TUBA", "TUBA"),
    OBOE("OBOE", "OBOE"),
    CASTANETS("CASTANETS", "CASTAÑUELAS"),
    GONG("GONG", "GONG"),
    DIDGERIDOO("DIDGERIDOO", "DIDGERIDOO"),
    DOUBLE_BASS("DOUBLE BASS", "CONTRABAJO"),
    LUTE("LUTE", "LAÚD"),
    VIOLA("VIOLA", "VIOLA"),
    HARPSICHORD("HARPSICHORD", "CLAVE"),
    PICCOLO("PICCOLO", "FLAUTÍN"),
    PIPES("PIPES", "PIPES"),
    WOOD_BLOCKS("WOOD BLOCKS", "BLOQUES DE MADERA"),
    BAMBOO_XYLOPHONE("BAMBOO XYLOPHONE", "XILÓFONO DE BAMBÚ"),
    CONGA("CONGA", "CONGAS"),
    BASSON("BASSON", "BAJO"),
    FRENCH_HORN("FRENCH HORN", "CUERNO FRANCÉS"),
    HARP("HARP", "ARPA"),
    DRUMS("DRUMS", "BATERÍA"),
    BAGPIPES("BAGPIPES", "GAITA");

    private final String musicalInstrumentCategory;
    private final String musicalInstrumentCategorySpTr;

    private MusicalInstrument(String musicalInstrumentCategory, String musicalInstrumentCategorySpTr) {
        this.musicalInstrumentCategory = musicalInstrumentCategory;
        this.musicalInstrumentCategorySpTr = musicalInstrumentCategorySpTr;
    }

    public String getMusicalInstrument() {
        return musicalInstrumentCategory;
    }
    
     public String getMusicalInstrumentSpTr() {
        return musicalInstrumentCategorySpTr;
    }
}
