package lesson15;

/**
 * Переписать класс Query используя статический класс.
 */
public class User3 {
    static String login = "Bird";
    static String password = "kurl-kurl";

    static class Query {
        void printToLog() {
            System.out.println("Пользователь " + login + " (пароль - " + password + ") отправил запрос.");
        }
    }

    public static void main(String[] args) {
        Query query = new Query();
        query.printToLog();
    }
}
