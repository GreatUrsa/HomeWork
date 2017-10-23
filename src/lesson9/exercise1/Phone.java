package lesson9.exercise1;

/**
 * Доделать класс Phone. (Задание с урока)
 * з) Создать метод sendMessage  с аргументами переменной длины. Данный метод принимает на вход номера телефонов,
 * которым будет отправлено сообщение. Метод выводит на консоль номера этих телефонов.
 * и) Изменить класс Phone в соответствии с концепцией JavaBean.
 * к) Реализовать подсчет количества созданных телефонов с помощью статической переменной.
 */
public class Phone {
    private String model;
    private String number;
    private double weight;
    private static int count = 0;

    public Phone(String m, String n, double w) {
        this();
        model = m;
        number = n;
        weight = w;
        count++;
    }

    public Phone() {
        model = "Apple";
        number = "122334455";
        weight = 0.150;
        count++;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double v) {
        this.weight = weight;
    }

    public void receiveCall(String name) {
        System.out.println("Звонит: " + name);
    }

    public void receiveCall(String name, String number) {
        System.out.println("Звонит: " + name + " " + number);
    }

    public void sendMessage(String... numbers) {
        for (String number : numbers) {
            System.out.println(number);
        }
    }

    String getPhoneNumber() {
        return number;
    }

    public  static int getCountPhones(){
        return count;
    }
    protected void finalize(){
        System.out.println("In finalize");
        count--;
        System.out.println(getCountPhones());
    }
}
