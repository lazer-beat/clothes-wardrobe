package com.aincorp.clotheswardrobe.entities;

import com.aincorp.clotheswardrobe.entities.emunerations.ClothesSize;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "clothes")
public class Clothes {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank(message = "Введите краткое имя")
    @Size(min = 2, max = 32, message = "Введено не корректное краткое имя одежды, введите больше двух символов")
    @Column(name = "name")
    private String name;


    @NotBlank(message = "Введите цвет одежды")
    @Size(min = 2, max = 32, message = "Введен не корректный цвет одежды, введите больше двух символов")
    @Column(name = "colour")
    private String colour;

    @Enumerated(EnumType.STRING)
    private ClothesSize clothesSize;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinTable(name = "clothes_cltype",
            joinColumns = @JoinColumn(name = "cl_id"),
            inverseJoinColumns = @JoinColumn(name = "clt_id")
    )
    private ClothesType clothesType;


    @NotBlank(message = "Введите фирму одежды")
    @Size(min = 2, max = 32, message = "Введена не корректная фирма одежды, введите больше двух символов")
    @Column(name = "brand")
    private String brand;

    @NotBlank(message = "Введите описание-примечание одежды")
    @Size(min = 2, max = 1024, message = "Введено не корректное описание-примечание одежды, введите больше двух символов")
    @Column(name = "note")
    private String note;

    @Column(name = "created_date")
    private Date createdDate;

    public Clothes() {
    }

    public Clothes(@NotBlank(message = "Введите краткое имя") @Size(min = 2, max = 32, message = "Введено не корректное краткое имя одежды, введите больше двух символов") String name, @NotBlank(message = "Введите цвет одежды") @Size(min = 2, max = 32, message = "Введен не корректный цвет одежды, введите больше двух символов") String colour, ClothesSize clothesSize, ClothesType clothesType, @NotBlank(message = "Введите фирму одежды") @Size(min = 2, max = 32, message = "Введена не корректная фирма одежды, введите больше двух символов") String brand, @NotBlank(message = "Введите описание-примечание одежды") @Size(min = 2, max = 1024, message = "Введено не корректное описание-примечание одежды, введите больше двух символов") String note, Date createdDate) {
        this.name = name;
        this.colour = colour;
        this.clothesSize = clothesSize;
        this.clothesType = clothesType;
        this.brand = brand;
        this.note = note;
        this.createdDate = createdDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public ClothesSize getClothesSize() {
        return clothesSize;
    }

    public void setClothesSize(ClothesSize clothesSize) {
        this.clothesSize = clothesSize;
    }

    public ClothesType getClothesType() {
        return clothesType;
    }

    public void setClothesType(ClothesType clothesType) {
        this.clothesType = clothesType;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
}
