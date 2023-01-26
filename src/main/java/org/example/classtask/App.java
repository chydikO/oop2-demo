package org.example.classtask;

/**
 * Створити клас автомобіль (Car)
 * Клас повинен містити закриті поля: назва автомобіля (name), колір (color) та ціна (price).
 * Створити два конструктори. Перший з одним параметром (назва), другий - з трьома.
 * Якщо викликаються конструктор з одним параметром, то колір по замовченню білий, ціна 0 баксів.
 *
 * Створити метод збільшення ціни (increasePrice) автомобіля на визначену суму.
 *
 * Створити два об'єкти використовуючи різні конструктори і вивести значення всіх полів через геттери.
 *
 * Додаткове завдання:
 * Створити статичне поле count, в якому рахувати кількість створених екземплярів класу Car,
 * і нестатичне поле id, в якому буде зберігатися порядковий номер екземпляру класу.
 */
public class App {
    public static void main(String[] args) {
        Car car1 = new Car("VAZ");
        Car car2 = new Car("Opel", "Black", 12345);

        System.out.println(car1.getName());
        System.out.println(car2.getPrice());

        System.out.println(car1);
        System.out.println(car2);

        System.out.println("Cars count:\t" + Car.getCount());
    }
}
