package com.luhanlin.designpattern.factory_method.builder;

import java.util.function.Supplier;

/**
 * @description: 添加动物分类
 * @author: Mr.Lu
 * @create: 2019-05-31 16:00
 **/
@FunctionalInterface
public interface AnimalBuilder {

    void add(AnimalType animalType, Supplier<Animal> supplier);
}
