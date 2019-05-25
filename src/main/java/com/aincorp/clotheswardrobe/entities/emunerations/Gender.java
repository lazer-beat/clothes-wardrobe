package com.aincorp.clotheswardrobe.entities.emunerations;

public enum Gender {
    MALE("Мужчина"), FEMALE("Женщина");

    private String description;

    Gender(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
