package com.aincorp.clotheswardrobe.entities;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "roles")
public class Role {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank(message = "Введите имя роли")
    @Size(min = 1, max = 32, message = "Введено не корректное имя роли, введите больше одного символа")
    @Column(name = "name")
    private String name;

    public Role() {
    }

    public Role(@NotBlank(message = "Введите имя роли") @Size(min = 1, max = 32, message = "Введено не корректное имя роли, введите больше одного символа") String name) {
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
