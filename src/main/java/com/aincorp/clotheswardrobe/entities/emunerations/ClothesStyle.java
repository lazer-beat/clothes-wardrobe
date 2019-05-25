package com.aincorp.clotheswardrobe.entities.emunerations;

public enum ClothesStyle {

    CLASSIC("Классический стиль"),
    CASUAL("Кэжуал"),
    SPORT("Спортивный стиль"),
    GLAMOR("Гламур"),
    BOHO("Бохо"),
    ETHNO_STYLE("Этно стиль"),
    GRUNGE("Гранж"),
    ROMANTIC_STYLE("Романтический стиль"),
    PREPPEE("Преппи"),
    MINIMALISM("Минимализм"),
    ECLECTICISM("Эклектика"),
    NEW_BOW("Нью-лук"),
    LINEN_STYLE("Бельевой стиль"),
    PINE_STYLE("Пижамный стиль"),
    RETRO_STYLE("Ретро стиль"),
    MILITARY_STYLE("Милитари стиль");

    private String description;

    ClothesStyle(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
