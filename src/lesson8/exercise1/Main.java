package lesson8.exercise1;

public class Main {

    public static void main(String[] args) {
        Phone myPhone = new Phone("Leia", "0661234567", 0.145);
        Phone hisPhone = new Phone();
        Phone herPhone = new Phone();

        System.out.println("Данные из конструктора Phone: " + myPhone.model + " " + myPhone.number + " " + myPhone.weight);

        myPhone.model = "LG G4";
        myPhone.number = "0951234567";
        myPhone.weight = 0.155;
        myPhone.receiveCall("Ursa");
        System.out.println(myPhone.getPhoneNumber());
        myPhone.receiveCall("Amidala", "565656");

        hisPhone.model = "Meizu M5";
        hisPhone.number = "0677654321";
        hisPhone.weight = 0.143;
        hisPhone.receiveCall("Neo");
        System.out.println(hisPhone.getPhoneNumber());
        hisPhone.receiveCall("Han Solo", "787878");

        herPhone.model = "Samsung Galaxy A5";
        herPhone.number = "0669876543";
        herPhone.weight = 0.155;
        hisPhone.receiveCall("Trinity");
        System.out.println(herPhone.getPhoneNumber());
        herPhone.receiveCall("Sunny", "898989");
    }
}
