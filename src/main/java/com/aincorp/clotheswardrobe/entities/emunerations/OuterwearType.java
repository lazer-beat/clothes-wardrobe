package com.aincorp.clotheswardrobe.entities.emunerations;

public enum OuterwearType {

    VEST("Жилет"),
    WINDBREACKER("Ветровка"),
    CASUAL_JUCKET("Куртка"),
    COAT("Пальто"),
    CLOAK("Плащ"),
    SHORT_FUR_COAT("Полушубок"),
    DOWN_JUCKET("Пуховик"),
    PARKA("Парка"),
    SHEEPSKIN_COAT("Дубленка"),
    FUR_COAT("Шуба");

    private String description;

    OuterwearType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
