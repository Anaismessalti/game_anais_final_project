package com.example.test.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.persistence.Table;

@Entity
@Table(name = "Toy")
public class TestModel {
    @Id
    @Getter
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tutorial_generator")
    private int id;
    @Getter @Setter
    @Column(name = "name")
    private String name;
    @Getter @Setter @Column(name = "age")
    private int age;
    @Getter @Setter @Column(name = "price")
    private double price;
    public TestModel() {
    }
    public TestModel(int id, String name, int age, double price) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.price = price;
    }
}
