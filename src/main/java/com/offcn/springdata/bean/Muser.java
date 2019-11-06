package com.offcn.springdata.bean;

import org.hibernate.annotations.GenericGenerators;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name = "user")
public class Muser implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)// 主键  自增长
    private int id;
    private String name;
    private String gender;


    public int getId() {
        return id;
    }

    public Muser setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Muser setName(String name) {
        this.name = name;
        return this;
    }

    public String getGender() {
        return gender;
    }

    public Muser setGender(String gender) {
        this.gender = gender;
        return this;
    }

    public Muser(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public Muser() {
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
