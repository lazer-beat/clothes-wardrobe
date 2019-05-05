package com.aincorp.clotheswardrobe.entities;

import javax.persistence.*;

@Entity
@Table(name = "shoes")
public class Shoes {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "shoe_name")
    private String name;


    public Shoes() {

    }

    public Shoes(String name) {
        this.name = name;
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
}
