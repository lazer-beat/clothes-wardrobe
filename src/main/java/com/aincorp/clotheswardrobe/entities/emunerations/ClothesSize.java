package com.aincorp.clotheswardrobe.entities.emunerations;


/*
Перечисление размеров одежды
 */
public enum ClothesSize {

    S("small"),
    M("middle"),
    L("large"),
    XS("extra small"),
    XL("extra large"),
    UNKNOWN("");


    private String size;

    ClothesSize(String size) {
        this.size = size;
    }

    public String size() {
        return size;
    }
}
