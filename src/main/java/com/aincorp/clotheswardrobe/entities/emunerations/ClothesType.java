package com.aincorp.clotheswardrobe.entities.emunerations;

public enum ClothesType {

    BLOUSE("Блуза"),
    SHIRT("Рубашка"),
    TROUSERS("Брюки"),
    BREECHES("Бриджи"),
    LEGGINGS("Лосины"),
    JEANS("Джинсы"),
    SHORTS("Шорты"),
    SKIRT("Юбка"),
    OVERALLS("Комбинезон"),
    JUMPER("Джемпер"),
    SWEATER("Свитер"),
    GOLF("Гольф"),
    PULLOVER("Пуловер"),
    JUCKET("Кофта"),
    CARDIGAN("Кардиган"),
    WOMAN_JUCKET("Жакет"),
    BLAZER("Пиджак"),
    BOLERO("Болеро"),
    TOP("Топ"),
    T_SHIRT("Футболка"),
    MIKE("Майка"),
    POLO("Поло"),
    T_SHIRT_TENNIS("Тенниска"),
    REGLAN("Реглан"),
    DRESS("Платье"),
    SUNDRESS("Сарафан"),
    TUNIC("Туника"),
    PONCHO("Пончо"),

    SPORTS_SUIT("Спортивный костюм");

    private String description;

    ClothesType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
