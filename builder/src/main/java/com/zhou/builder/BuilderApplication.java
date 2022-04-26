package com.zhou.builder;


import com.zhou.builder.characteristic.Nationality;
import com.zhou.builder.characteristic.SkinColor;
import com.zhou.builder.person.Person;
import com.zhou.builder.person.PersonBuilder;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BuilderApplication {

    public static void main(String[] args) {

        Person personWang = new PersonBuilder().name("小王").age(25).nationality(Nationality.CHINA).skinColor(SkinColor.YELLOW).build();
        Person personZhang = new PersonBuilder().name("小张").age(28).nationality(Nationality.USA).skinColor(SkinColor.WHITE).build();
        Person personLiu = new PersonBuilder().name("老王").age(48).nationality(Nationality.JAPAN).skinColor(SkinColor.BLACK).build();

        log.info(personWang.toString());
        log.info(personZhang.toString());
        log.info(personLiu.toString());
    }

}
