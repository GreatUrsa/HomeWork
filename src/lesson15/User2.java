package lesson15;

/**
 * Переписать предыдущее задание, используя локальный класс.
 */
public class User2 {
    private String login = "Cat";

    public void createQuery() {
        final String password = "meow";
        class Query {
            public void printToLog() {
                System.out.println("Пользователь " + login + " (пароль - " + password + " ) отправил запрос.");
            }
        }
        Query query = new Query();
        query.printToLog();
    }

    public static void main(String[] args) {
        User2 user2 = new User2();
        user2.createQuery();
    }
}
