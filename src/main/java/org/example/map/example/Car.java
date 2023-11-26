package org.example.map.example;

import java.util.List;

public class Car {
    private String color;
    private List<Engine> engineList;

    public Car(String color, List<Engine> engineList) {
        this.color = color;
        this.engineList = engineList;
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
}
