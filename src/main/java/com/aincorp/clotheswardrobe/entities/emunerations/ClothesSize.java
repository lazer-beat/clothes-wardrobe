package com.aincorp.clotheswardrobe.entities.emunerations;


public enum  ClothesSize {

    S("small"),
    M("middle"),
    L("large"),
    xS("extra small"),
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
