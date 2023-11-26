package org.example.map.example;

import java.util.Collections;
import java.util.List;

public class Car {
    private String color;
    private List<Engine> engineList;

    public Car(String color, List<Engine> engineList) {
        this.color = color;
        this.engineList = engineList;
    }

    public Car() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public List<Engine> getEngineList() {
        return engineList;
    }

    public void setEngineList(List<Engine> engineList) {
        this.engineList = engineList;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", engineList=" + engineList +
                '}';
    }

    public static class CarBuilder {

        private final Car car = new Car();

        public Car build() {
            return car;
        }

        public CarBuilder color(String color) {
            car.setColor(color);
            return this;
        }

        public CarBuilder engine(List<Engine> engine) {
            car.setEngineList(engine);
            return this;
        }

    }
}
