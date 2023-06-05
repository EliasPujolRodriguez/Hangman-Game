package model;

import static java.lang.Integer.min;
import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.Math.random;
import java.util.ArrayList;
import java.util.Random;

public class Category {
    private ArrayList<String> nList = new ArrayList<>();
    private String category_name;
    private Random random;
    private Integer lvl = 0;
    private String word;
    private int pos = 0;
    private int badGuessesCounter = 0;
    private int counter = 0;

    public Category() {
        this.random = new Random();
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public Integer getLvl() {
        return lvl;
    }

    public void setLvl(Integer lvl) {
        this.lvl = lvl;
    }

    public String getCategory_name() {
        return "Category:" + category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getBadGuessesCounter() {
        return badGuessesCounter;
    }

    public void setBadGuessesCounter(int badGuessesCounter) {
        this.badGuessesCounter = badGuessesCounter;
    }

    //método que va a obtener la lista de colores
    public ArrayList<String> getColorList() {
        Color[] color = Color.values();
        ArrayList<String> c = new ArrayList<>();
        ArrayList<Integer> num = new ArrayList<>(11);

        for (int i = 0; i < 10; i++) {
            int r = random.nextInt(color.length);

            if (num.contains(r)) {
                i--;
            }

            if (!num.contains(r)) {
                num.add(r);
                c.add(color[num.get(i).intValue()].getColor().toString());
            }
        }
        return c;
    }

    public ArrayList<String> getNumberList() {
        Number[] n = Number.values();
        ArrayList<String> nList = new ArrayList<>();
        ArrayList<Integer> num = new ArrayList<>(11);

        for (int i = 0; i < 10; i++) {
            int r = random.nextInt(n.length);

            if (num.contains(r)) {
                i--;
            }

            if (!num.contains(r)) {
                num.add(r);
                nList.add(n[num.get(i).intValue()].getNumber().toString());
            }
        }
        return nList;
    }

    public ArrayList<String> getHFour() {
        HouseNFourniture[] n = HouseNFourniture.values();
        ArrayList<String> nList = new ArrayList<>();
        ArrayList<Integer> num = new ArrayList<>(11);

        for (int i = 0; i < 1; i++) {
            int r = random.nextInt(n.length);

            if (num.contains(r)) {
                i--;
            }

            if (!num.contains(r)) {
                num.add(r);
                nList.add(n[num.get(i).intValue()].getHouseNFourniture());
            }
        }
        return nList;
    }

    public ArrayList<String> getAnimals() {
        Animal[] n = Animal.values();
        ArrayList<String> nList = new ArrayList<>();
        ArrayList<Integer> num = new ArrayList<>(11);

        for (int i = 0; i < 1; i++) {
            int r = random.nextInt(n.length);

            if (num.contains(r)) {
                i--;
            }

            if (!num.contains(r)) {
                num.add(r);
                nList.add(n[num.get(i).intValue()].getAnimal());
            }
        }
        return nList;
    }

    public ArrayList<String> getCountryList() {
        Country[] n = Country.values();
        ArrayList<String> nList = new ArrayList<>();
        ArrayList<Integer> num = new ArrayList<>(11);

        for (int i = 0; i < 1; i++) {
            int r = random.nextInt(n.length);

            if (num.contains(r)) {
                i--;
            }

            if (!num.contains(r)) {
                num.add(r);
                nList.add(n[num.get(i).intValue()].getCountry());
            }
        }
        return nList;
    }

    public ArrayList<String> getFoodList() {
        Food[] n = Food.values();
        ArrayList<String> nList = new ArrayList<>();
        ArrayList<Integer> num = new ArrayList<>(11);

        for (int i = 0; i < 1; i++) {
            int r = random.nextInt(n.length);

            if (num.contains(r)) {
                i--;
            }

            if (!num.contains(r)) {
                num.add(r);
                nList.add(n[num.get(i).intValue()].getFood());
            }
        }
        return nList;
    }

    public ArrayList<String> getMusicalInstruments() {
        MusicalInstrument[] n = MusicalInstrument.values();
        ArrayList<String> nList = new ArrayList<>();
        ArrayList<Integer> num = new ArrayList<>(11);

        for (int i = 0; i < 1; i++) {
            int r = random.nextInt(n.length);

            if (num.contains(r)) {
                i--;
            }

            if (!num.contains(r)) {
                num.add(r);
                nList.add(n[num.get(i).intValue()].getMusicalInstrument());
            }
        }
        return nList;
    }

    public ArrayList<String> getToyList() {
        Toys[] n = Toys.values();
        ArrayList<String> nList = new ArrayList<>();
        ArrayList<Integer> num = new ArrayList<>(11);

        for (int i = 0; i < 1; i++) {
            int r = random.nextInt(n.length);

            if (num.contains(r)) {
                i--;
            }

            if (!num.contains(r)) {
                num.add(r);
                nList.add(n[num.get(i).intValue()].getToy());
            }
        }
        return nList;
    }

    public ArrayList<String> getSeasonList() {
        Seasons[] n = Seasons.values();
        ArrayList<String> nList = new ArrayList<>();
        ArrayList<Integer> num = new ArrayList<>(11);

        for (int i = 0; i < 1; i++) {
            int r = random.nextInt(n.length);

            if (num.contains(r)) {
                i--;
            }

            if (!num.contains(r)) {
                num.add(r);
                nList.add(n[num.get(i).intValue()].getSeason());
            }
        }
        return nList;
    }

    public ArrayList<String> getHumanBodyList() {
        HumanBody[] n = HumanBody.values();
        ArrayList<String> nList = new ArrayList<>();
        ArrayList<Integer> num = new ArrayList<>(11);

        for (int i = 0; i < 1; i++) {
            int r = random.nextInt(n.length);

            if (num.contains(r)) {
                i--;
            }

            if (!num.contains(r)) {
                num.add(r);
                nList.add(n[num.get(i).intValue()].getHumanBody());
            }
        }
        return nList;
    }

    public ArrayList<String> getFamilyList() {
        Family[] n = Family.values();
        ArrayList<String> nList = new ArrayList<>();
        ArrayList<Integer> num = new ArrayList<>(11);

        for (int i = 0; i < 1; i++) {
            int r = random.nextInt(n.length);

            if (num.contains(r)) {
                i--;
            }

            if (!num.contains(r)) {
                num.add(r);
                nList.add(n[num.get(i).intValue()].getFamilyMember());
            }
        }
        return nList;
    }

    public ArrayList<String> getClothesList() {
        Clothes[] n = Clothes.values();
        ArrayList<String> nList = new ArrayList<>();
        ArrayList<Integer> num = new ArrayList<>(11);

        for (int i = 0; i < 1; i++) {
            int r = random.nextInt(n.length);

            if (num.contains(r)) {
                i--;
            }

            if (!num.contains(r)) {
                num.add(r);
                nList.add(n[num.get(i).intValue()].getClothes());
            }
        }
        return nList;
    }

    public void i() {
        nList.add(getHFour().get(0));
        nList.add(getColorList().get(0));
        nList.add(getNumberList().get(0));
        nList.add(getAnimals().get(0));
        nList.add(getCountryList().get(0));
        nList.add(getFoodList().get(0));
        nList.add(getMusicalInstruments().get(0));
        nList.add(getToyList().get(0));
        nList.add(getSeasonList().get(0));
        nList.add(getHumanBodyList().get(0));
        nList.add(getFamilyList().get(0));
        nList.add(getClothesList().get(0));
    }

    public String randomWord(int pos) {//método que va a mostrar una palabra al azar dependiendo de cada nivel
        for (int i = 0; i < nList.size(); i++) {
            System.out.println(nList.get(i));
            this.word = nList.get(pos);
        }

        return word;
    }

    public String getPracticeword(String category, int counter) {
        String word = "";
        if (category.equals("Category: Animals")) {
            word = this.getAnimalList().get(counter);
        }

        if (category.equals("Category: Clothes")) {
            word = this.getClothes().get(counter);
        }

        if (category.equals("Category: Family members")) {
            word = this.getFamily().get(counter);
        }

        if (category.equals("Category: Colours")) {
            word = this.getColor().get(counter);
        }

        if (category.equals("Category: Countries")) {
            word = this.getCountry().get(counter);
        }

        if (category.equals("Category: Number")) {
            word = this.getNumber().get(counter);
        }

        if (category.equals("Category: Food")) {
            word = this.getFood().get(counter);
        }

        if (category.equals("Category: Human body")) {
            word = this.getHumanBodyParts().get(counter);
        }

        if (category.equals("Category: House and fourniture")) {
            word = this.getHFourList().get(counter);
        }

        if (category.equals("Category: Musical instruments")) {
            word = this.getMIns().get(counter);
        }

        if (category.equals("Category: Seasons")) {
            word = this.getSeasons().get(counter);
        }

        if (category.equals("Category: Toys")) {
            word = this.getToys().get(counter);
        }

        return word;
    }

    public String getTranslationWord(String category, int counter) {
        String word = "";
        if (category.equals("Category: Animals")) {
            word = this.getAnimalsListTranslation().get(counter);
        }

        if (category.equals("Category: Clothes")) {
            word = this.getClothesListTranslation().get(counter);
        }

        if (category.equals("Category: Family members")) {
            word = this.getFamilyListTranslation().get(counter);
        }

        if (category.equals("Category: Colours")) {
            word = this.getColoursListTranslation().get(counter);
        }

        if (category.equals("Category: Countries")) {
            word = this.getCountriesTranslation().get(counter);
        }

        if (category.equals("Category: Number")) {
            word = this.getNumberListTranslation().get(counter);
        }

        if (category.equals("Category: Food")) {
            word = this.getFoodListTranslation().get(counter);
        }

        if (category.equals("Category: Human body")) {
            word = this.getHumanBodyTranslation().get(counter);
        }

        if (category.equals("Category: House and fourniture")) {
            word = this.getHFourListSpanishTranslation().get(counter);
        }

        if (category.equals("Category: Musical instruments")) {
            word = this.getMusicalInatrumentTranslation().get(counter);
        }

        if (category.equals("Category: Seasons")) {
            word = this.getSeasonsYearsTranslation().get(counter);
        }

        if (category.equals("Category: Toys")) {
            word = this.getToyListTranslation().get(counter);
        }

        return word;
    }

    public ArrayList<String> getHFourList() {
        ArrayList<String> list = new ArrayList<>();
        HouseNFourniture[] n = HouseNFourniture.values();

        for (int i = 0; i < n.length; i++) {
            list.add(n[i].getHouseNFourniture());
        }

        return list;
    }

    public ArrayList<String> getHFourListSpanishTranslation() {
        ArrayList<String> list = new ArrayList<>();
        HouseNFourniture[] n = HouseNFourniture.values();

        for (int i = 0; i < n.length; i++) {
            list.add(n[i].getHouseFrSpTranslation());
        }

        return list;
    }

    public ArrayList<String> getAnimalList() {
        ArrayList<String> list = new ArrayList<>();
        Animal[] n = Animal.values();

        for (int i = 0; i < n.length; i++) {
            list.add(n[i].getAnimal());
        }
        return list;
    }

    public ArrayList<String> getClothes() {
        ArrayList<String> list = new ArrayList<>();
        Clothes[] n = Clothes.values();

        for (int i = 0; i < n.length; i++) {
            list.add(n[i].getClothes());
        }
        return list;
    }

    public ArrayList<String> getColor() {
        ArrayList<String> list = new ArrayList<>();
        Color[] n = Color.values();

        for (int i = 0; i < n.length; i++) {
            list.add(n[i].getColor());
        }
        return list;
    }

    public ArrayList<String> getCountry() {
        ArrayList<String> list = new ArrayList<>();
        Country[] n = Country.values();

        for (int i = 0; i < n.length; i++) {
            list.add(n[i].getCountry());
        }
        return list;
    }

    public ArrayList<String> getFamily() {
        ArrayList<String> list = new ArrayList<>();
        Family[] n = Family.values();

        for (int i = 0; i < n.length; i++) {
            list.add(n[i].getFamilyMember());
        }
        return list;
    }

    public ArrayList<String> getFood() {
        ArrayList<String> list = new ArrayList<>();
        Food[] n = Food.values();

        for (int i = 0; i < n.length; i++) {
            list.add(n[i].getFood());
        }
        return list;
    }

    public ArrayList<String> getHouseAndFourniture() {
        ArrayList<String> list = new ArrayList<>();
        HouseNFourniture[] n = HouseNFourniture.values();

        for (int i = 0; i < n.length; i++) {
            list.add(n[i].getHouseNFourniture());
        }

        return list;

    }

    public ArrayList<String> getHumanBodyParts() {
        ArrayList<String> list = new ArrayList<>();
        HumanBody[] n = HumanBody.values();

        for (int i = 0; i < n.length; i++) {
            list.add(n[i].getHumanBody());
        }
        return list;
    }

    public ArrayList<String> getMIns() {
        ArrayList<String> list = new ArrayList<>();
        MusicalInstrument[] n = MusicalInstrument.values();

        for (int i = 0; i < n.length; i++) {
            list.add(n[i].getMusicalInstrument());
        }
        return list;
    }

    public ArrayList<String> getNumber() {
        ArrayList<String> list = new ArrayList<>();
        Number[] n = Number.values();

        for (int i = 0; i < n.length; i++) {
            list.add(n[i].getNumber());
        }
        return list;
    }

    public ArrayList<String> getNumberListTranslation() {
        ArrayList<String> list = new ArrayList<>();
        Number[] n = Number.values();

        for (int i = 0; i < n.length; i++) {
            list.add(n[i].getNumberSpTranslation());
        }

        return list;
    }

    public ArrayList<String> getSeasons() {
        ArrayList<String> list = new ArrayList<>();
        Seasons[] n = Seasons.values();

        for (int i = 0; i < n.length; i++) {
            list.add(n[i].getSeason());
        }
        return list;
    }

    public ArrayList<String> getToys() {
        ArrayList<String> list = new ArrayList<>();
        Toys[] n = Toys.values();

        for (int i = 0; i < n.length; i++) {
            list.add(n[i].getToy());
        }
        return list;
    }

    public ArrayList<String> getColoursListTranslation() {
        ArrayList<String> list = new ArrayList<>();
        Color[] n = Color.values();

        for (int i = 0; i < n.length; i++) {
            list.add(n[i].getColorSpTrns());
        }
        return list;
    }

    public ArrayList<String> getClothesListTranslation() {
        ArrayList<String> list = new ArrayList<>();
        Clothes[] n = Clothes.values();

        for (int i = 0; i < n.length; i++) {
            list.add(n[i].getClothesSpTrns());
        }
        return list;
    }

    public ArrayList<String> getToyListTranslation() {
        ArrayList<String> list = new ArrayList<>();
        Toys[] n = Toys.values();

        for (int i = 0; i < n.length; i++) {
            list.add(n[i].getToySpTransalation());
        }
        return list;
    }

    public ArrayList<String> getFamilyListTranslation() {
        ArrayList<String> list = new ArrayList<>();
        Family[] n = Family.values();

        for (int i = 0; i < n.length; i++) {
            list.add(n[i].getFamilyMemberSpTrn());
        }
        return list;
    }

    public ArrayList<String> getAnimalsListTranslation() {
        ArrayList<String> list = new ArrayList<>();
        Animal[] n = Animal.values();

        for (int i = 0; i < n.length; i++) {
            list.add(n[i].getAnimalCategorySp());
        }

        return list;
    }

    public ArrayList<String> getFoodListTranslation() {
        ArrayList<String> list = new ArrayList<>();
        Food[] n = Food.values();

        for (int i = 0; i < n.length; i++) {
            list.add(n[i].getFoodSpTranslation());
        }

        return list;
    }

    public ArrayList<String> getSeasonsYearsTranslation() {
        ArrayList<String> list = new ArrayList<>();
        Seasons[] n = Seasons.values();

        for (int i = 0; i < n.length; i++) {
            list.add(n[i].getSeasonSpTranslation());
        }

        return list;
    }

    public ArrayList<String> getCountriesTranslation() {
        ArrayList<String> list = new ArrayList<>();
        Country[] n = Country.values();

        for (int i = 0; i < n.length; i++) {
            list.add(n[i].getCountrySpTr());
        }

        return list;
    }
    
      public ArrayList<String> getHumanBodyTranslation() {
        ArrayList<String> list = new ArrayList<>();
        HumanBody[] n = HumanBody.values();

        for (int i = 0; i < n.length; i++) {
            list.add(n[i].getHumanBodySpTrans());
        }

        return list;
    }
      
       public ArrayList<String> getMusicalInatrumentTranslation() {
        ArrayList<String> list = new ArrayList<>();
        MusicalInstrument[] n = MusicalInstrument.values();

        for (int i = 0; i < n.length; i++) {
            list.add(n[i].getMusicalInstrumentSpTr());
        }

        return list;
    }
}
