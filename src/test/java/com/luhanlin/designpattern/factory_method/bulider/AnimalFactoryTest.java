package com.luhanlin.designpattern.factory_method.bulider;

import com.luhanlin.designpattern.factory_method.builder.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @description: 测试builder模式工厂
 * @author: Mr.Lu
 * @create: 2019-05-31 17:02
 **/
public class AnimalFactoryTest {

    private AnimalFactory factory;

    @BeforeEach
    public void init(){
        factory = AnimalFactory.factory(builder -> {
            builder.add(AnimalType.CAT, Cat::new);
            builder.add(AnimalType.DOG, Dog::new);
            builder.add(AnimalType.PIG, Pig::new);
        });
    }

    @Test
    public void testDog(){
        Animal animal = factory.create(AnimalType.DOG);
        verifyWeapon(animal, Dog.class);
    }

    @Test
    public void testCat(){
        Animal animal = factory.create(AnimalType.CAT);
        verifyWeapon(animal, Cat.class);
    }

    @Test
    public void testPig(){
        Animal animal = factory.create(AnimalType.PIG);
        verifyWeapon(animal, Pig.class);
    }

    /**
     * This method asserts that the animal object that is passed is an instance of the clazz
     *
     * @param animal animal object which is to be verified
     * @param clazz  expected class of the animal
     */
    private void verifyWeapon(Animal animal, Class<?> clazz) {
        assertTrue(clazz.isInstance(animal), "Animal must be an object of: " + clazz.getName());
    }
}
