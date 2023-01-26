package org.example.classtask;

import java.util.UUID;

public class Car {
    private static int count = 0;
    private final String id;

    private String name;
    private String color;
    private int price;

    public Car(String name) {
        this(name, "White", 0);
    }

    public Car(String name, String color, int price) {
        this.name = name;
        this.color = color;
        this.price = price;

        count++;
        //this.id = count;
        this.id = UUID.randomUUID().toString();;
    }

    public static int getCount() {
        return count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void increasePrice(int price) {
        this.price += price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
