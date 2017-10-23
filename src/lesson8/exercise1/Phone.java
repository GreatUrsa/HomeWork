package lesson8.exercise1;

/**
 * Класс Phone. (Задание с урока)
 * a) Создайте класс Phone, который содержит переменные number, model и weight.
 * б) Создайте три экземпляра этого класса.
 * в) Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего.
 * Выводит на консоль сообщение “Звонит {name}”. getPhoneNumber – возвращает номер телефона.
 * Вызвать эти методы для каждого из объектов.
 * г) Добавить конструктор в класс Phone, который принимает на вход параметры для инициализации переменных класса.
 * д) Добавить конструктор без параметров.
 * е) Вызвать из конструктора с параметрами конструктор по умолчанию.
 * ж) Добавьте перегруженный метод receiveCall, который принимает два параметра -
 * имя звонящего и номер телефона звонящего. Вызвать этот метод.
 */
public class Phone {
    String model, number;
    double weight;

    void receiveCall(String name) {
        System.out.println("Звонит: " + name);
    }

    void receiveCall(String name, String number) {
        System.out.println("Звонит: " + name + " " + number);
    }

    String getPhoneNumber() {
        return number;
    }

    Phone(String m, String n, double w) {
        this();
        model = m;
        number = n;
        weight = w;
    }

    Phone() {
        model = "Apple";
        number = "122334455";
        weight = 0.150;
    }
}
