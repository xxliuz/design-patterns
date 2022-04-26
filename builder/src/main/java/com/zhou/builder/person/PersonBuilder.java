package com.zhou.builder.person;

import com.zhou.builder.characteristic.Nationality;
import com.zhou.builder.characteristic.SkinColor;
import lombok.Getter;

/**
 * @Author: zhou.liu
 * @Date: 2022/4/26 14:30
 * @Description: 创建者
 */
@Getter
public class PersonBuilder {

    private String name;
    private Integer age;
    private Nationality nationality;
    private SkinColor skinColor;

    public PersonBuilder age(Integer age) {
        this.age = age;
        return this;
    }

    public PersonBuilder name(String name) {
        if (null == name) {
            throw new IllegalArgumentException("人必须有名字!");
        }
        this.name = name;
        return this;
    }

    public PersonBuilder nationality(Nationality nationality) {
        this.nationality = nationality;
        return this;
    }

    public PersonBuilder skinColor(SkinColor skinColor) {
        this.skinColor = skinColor;
        return this;
    }

    public Person build() {
        return new Person(this);
    }
}
