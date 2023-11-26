package org.example.map.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("red", List.of(new Engine(20), new Engine(15)));
        Car car2 = new Car("blue", List.of(new Engine(60)));
        Car car3 = new Car("green", List.of(new Engine(50)));
        Car car4 = new Car("yellow", List.of(new Engine(40)));
        Car car5 = new Car("black", List.of(new Engine(30)));

        List<Car> carList = new ArrayList<>();
        carList.add(car);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);

        // making a new stream containing all the engines (one-many - getting a lot of engines from few cars)
        List<Object> engineList = carList.stream().flatMap((Function<Car, Stream<?>>) car1 -> car1.getEngineList().stream()).toList();
        // making a new stream containing lists of engines (one-one - getting lists in quantity equal to number of cars)
        List<List<Engine>> engineList1 = carList.stream().map(Car::getEngineList).toList();

        System.out.println(engineList);
        System.out.println(engineList1);

        Car.CarBuilder carBuilder = new Car.CarBuilder();
        Car car1 = carBuilder
                .color("Red")
                .engine(Collections.singletonList(new Engine(220)))
                .build();

    }
}
