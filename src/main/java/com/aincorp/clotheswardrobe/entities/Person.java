package com.aincorp.clotheswardrobe.entities;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name = "persons")
public class Person {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank(message = "Введите ваше имя")
    @Size(min = 1, message = "Введено не корректное имя, введите больше одного символа")
    @Column(name = "first_name")
    private String firstName;

    @NotBlank(message = "Введите вашу фамилию")
    @Size(min = 1, message = "Введена не корректная фамилия, введите больше одного символа")
    @Column(name = "second_name")
    private String secondName;

    @NotBlank(message = "Введите ваше отчество")
    @Size(min = 1, message = "Введено не корректное отчество, введите больше одного символа")
    @Column(name = "last_name")
    private String lastName;

    @NotBlank(message = "Пожалуйста введите ваш номер телефона")
    @Pattern(regexp = "[\\d]{10}")
    @Column(name = "phone_number")
    private String phoneNumber;

    @NotBlank(message = "Пожалуйста введите ваш емейл адрес")
    @Email(message = "Введите корректный емейл адрес")
    @Column(name = "email")
    private String email;

    @OneToOne(mappedBy = "person", cascade = CascadeType.ALL, fetch = FetchType.LAZY, optional = false)
    private User user;

    public Person() {
    }

    public Person(@NotBlank(message = "Введите ваше имя") @Size(min = 1, message = "Введено не корректное имя, введите больше одного символа") String firstName, @NotBlank(message = "Введите вашу фамилию") @Size(min = 1, message = "Введена не корректная фамилия, введите больше одного символа") String secondName, @NotBlank(message = "Введите ваше отчество") @Size(min = 1, message = "Введено не корректное отчество, введите больше одного символа") String lastName, @NotBlank(message = "Пожалуйста введите ваш номер телефона") @Pattern(regexp = "[\\d]{10}") String phoneNumber, @NotBlank(message = "Пожалуйста введите ваш емейл адрес") @Email(message = "Введите корректный емейл адрес") String email, User user) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
