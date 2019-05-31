package com.luhanlin.designpattern.factory_method.builder;

import java.util.HashMap;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * @description: 工厂
 * @author: Mr.Lu
 * @create: 2019-05-31 16:08
 **/
@FunctionalInterface
public interface AnimalFactory {

    /**
     * 根据 Animal 类型创建对象
     * @param animalType
     * @return
     */
    Animal create(AnimalType animalType);

    /**
     * 创建一个Consumer集，初始化工厂类
     * @param consumer
     * @return
     */
    static AnimalFactory factory(Consumer<AnimalBuilder> consumer){
        HashMap<AnimalType, Supplier<Animal>> map = new HashMap<>();

        consumer.accept(map::put);

        return animalType -> map.get(animalType).get();
    }

}
