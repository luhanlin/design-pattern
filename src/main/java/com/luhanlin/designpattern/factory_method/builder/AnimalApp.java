package com.luhanlin.designpattern.factory_method.builder;

import lombok.extern.log4j.Log4j2;

/**
 * @description: app
 * @author: Mr.Lu
 * @create: 2019-05-31 16:16
 **/
@Log4j2
public class AnimalApp {

    public static void main(String[] args) {
        AnimalFactory factory = AnimalFactory.factory(builder -> {
            builder.add(AnimalType.CAT, Cat::new);
            builder.add(AnimalType.DOG, Dog::new);
            builder.add(AnimalType.PIG, Pig::new);
        });

        Animal animal = factory.create(AnimalType.CAT);
        log.info(animal.toString());

        Animal animal1 = factory.create(AnimalType.DOG);
        log.info(animal1.toString());

        Animal animal2 = factory.create(AnimalType.PIG);
        log.info(animal2.toString());
    }
}
