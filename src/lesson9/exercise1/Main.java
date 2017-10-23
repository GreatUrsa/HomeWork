package lesson9.exercise1;

public class Main {
    public static void main(String[] args) {
        Phone myPhone = new Phone("Leia", "0661234567", 0.145);
        Phone hisPhone = new Phone();
        Phone herPhone = new Phone();

        System.out.println("Данные из конструктора Phone: " + myPhone.getModel() + " " + myPhone.getNumber() + " " + myPhone.getWeight());

        myPhone.setModel("LG G4");
        myPhone.setNumber("0951234567");
        myPhone.setWeight(0.155);
        myPhone.receiveCall("Ursa");
        System.out.println(myPhone.getPhoneNumber());
        myPhone.receiveCall("Amidala", "565656");

        hisPhone.setModel("Meizu M5");
        hisPhone.setNumber("0677654321");
        hisPhone.setWeight(0.143);
        hisPhone.receiveCall("Neo");
        System.out.println(hisPhone.getPhoneNumber());
        hisPhone.receiveCall("Han Solo", "787878");

        herPhone.setModel("Samsung Galaxy A5");
        herPhone.setNumber("0669876543");
        herPhone.setWeight(0.155);
        hisPhone.receiveCall("Trinity");
        System.out.println(herPhone.getPhoneNumber());
        herPhone.receiveCall("Sunny", "898989");

        myPhone.sendMessage();
        myPhone.sendMessage("12233221");
        myPhone.sendMessage("23344332", "34455443", "45566554");

        System.out.println("Количества созданных телефонов: " + Phone.getCountPhones());

        myPhone=null;
        System.gc();
    }
}
