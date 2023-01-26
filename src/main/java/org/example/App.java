package org.example;

import java.util.Random;
import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Point.getCount() = " + Point.getCount());
        Point p = new Point();
        System.out.println("Point.getCount() = " + Point.getCount());
        System.out.println("x: " + p.getX() + " y: " + p.getY());
        p.move(10, 20);
        System.out.println("x: " + p.getX() + " y: " + p.getY());
        // поліморфізм
        p = new Point(1, 1);
        System.out.println("Point.getCount() = " + Point.getCount());
        System.out.println("x: " + p.getX() + " y: " + p.getY());

    }
}

class Point {
    private static int count;
    private int x; // field поле класу
    private int y; // поля класу ініціюються значеннями за замовченням (0 або null або false)
    Point() {
        // count++;
        this(0, 0); // DRY делегування ініціалізації
                        // об'єкту конструктору з параметрами!
    }
    Point(int x, int y) { // перегрузка
        Point.count++;
        this.x = x;
        this.y = y;
    }

    void move(int dx) {
        move(dx, 0); // DRY
    }
    void move(int dx, int dy) {
        x += dx;
        y += dy;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public static int getCount() {
        return count;
    }
}
