package model;

public enum Family {
    MOTHER("MOTHER", "MADRE"),
    MOM("MOM", "MAMÁ"),
    SON("SON", "HIJO"),
    FATHER("FATHER", "PADRE"),
    PARENT("PARENT", "MADRE O PADRE"),
    DAD("DAD", "PAPÁ"),
    DAUGHTER("DAUGHTER", "HIJA"),
    SISTER("SISTER", "HERMANA"),
    BROTHER("BROTHER", "HERMANO"),
    GRANDMOTHER("GRANDMOTHER", "ABUELA"),
    GRANDPARENT("GRANDPARENT", "ABUELO"),
    GRANDSON("GRANDSON", "NIETO"),
    GRANDFATHER("GRANDFATHER", "ABUELO"),
    GRANDDAUGHTER("GRANDDAUGHTER", "NIETA"),
    GRANDCHILD("GRANDCHILD", "NIETA O NIETO"),
    AUNT("AUNT", "TÍA"),
    UNCLE("UNCLE", "TÍO"),
    NIECE("NIECE", "SOBRINA"),
    NEPHEW("NEPHEW", "SOBRINO"),
    COUSIN("COUSIN", "PRIMO O PRIMA"),
    COUSINS("COUSINS", "PRIMOS"),
    WIFE("WIFE", "ESPOSA"),
    HUSBAND("HUSBAND", "ESPOSO"),
    SISTER_IN_LAW("SISTER IN LAW", "CUÑADA"),
    BROTHER_IN_LAW("BROTHER IN LAW", "CUÑADO"),
    MOTHER_IN_LAW("MOTHER IN LAW", "SUEGRA"),
    FATHER_IN_LAW("FATHER IN LAW", "SUEGRO"),
    PARTNER("PARTNER", "PAREJA"),
    FIANCE("FIANCE", "PROMETIDO/A"),
    SON_IN_LAW("SON IN LAW", "YERNO/A");

    private final String familyMemberCategory;
    private final String familyMemberCategorySpTrn;

    private Family(String familyMemberCategory, String familyMemberCategorySpTrn) {
        this.familyMemberCategory = familyMemberCategory;
        this.familyMemberCategorySpTrn = familyMemberCategorySpTrn;
    }

    public String getFamilyMember() {
        return familyMemberCategory;
    }
    
    public String getFamilyMemberSpTrn() {
        return familyMemberCategorySpTrn;
    }
}
