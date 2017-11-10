package lesson16;

/**
 * а) Создать обобщенный класс с тремя параметрами (T, V, K). Класс содержит три переменные типа (T, V, K),
 * конструктор, принимающий на вход параметры типа (T, V, K), методы возвращающие значения трех переменных.
 * Создать метод, выводящий на консоль имена классов для трех переменных класса.
 */
public class Exercise1<T, V, K> {
    T ob1;
    V ob2;
    K ob3;

    public Exercise1(T ob1, V ob2, K ob3) {
        this.ob1 = ob1;
        this.ob2 = ob2;
        this.ob3 = ob3;
    }

    void className() {
        System.out.println("Класс для переменной T -  " + ob1.getClass().getName());
        System.out.println("Класс для переменной V -  " + ob2.getClass().getName());
        System.out.println("Класс для переменной K -  " + ob3.getClass().getName());
    }

    T getOb1() {
        return ob1;
    }

    V getOb2() {
        return ob2;
    }

    K getOb3() {
        return ob3;
    }
}
