package com.codeup.springblog;

import javax.persistence.*;

@Entity
@Table(name="people")
public class Person {
    @Id
    @GeneratedValue
    @Column(length = 11)
    private int id;

    @Column(length = 11, nullable = false)
    private int age;

    @Column(nullable = false)
    private String name;

    @Column(name = "reside_state", nullable = false, columnDefinition = "char(2)")
    private String resideState;

    public Person(int id, int age, String name, String resideState) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.resideState = resideState;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResideState() {
        return resideState;
    }

    public void setResideState(String resideState) {
        this.resideState = resideState;
    }
}
