package com.zhou.builder.person;

import com.zhou.builder.characteristic.Nationality;
import com.zhou.builder.characteristic.SkinColor;
import lombok.Getter;


/**
 * @Author: zhou.liu
 * @Date: 2022/4/26 14:24
 * @Description: 人
 */
@Getter
public class Person {

    private final String name;

    private final Integer age;

    private final Nationality nationality;

    private final SkinColor skinColor;

    public Person(PersonBuilder personBuilder){
        this.name = personBuilder.getName();
        this.age = personBuilder.getAge();
        this.skinColor = personBuilder.getSkinColor();
        this.nationality = personBuilder.getNationality();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", nationality=" + nationality +
                ", skinColor=" + skinColor +
                '}';
    }

}
