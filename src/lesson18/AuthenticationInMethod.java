package lesson18;

/**
 * Перехват и обработка  исключений должны происходить в вызывающем методе.
 */
public class AuthenticationInMethod {
    public static void main(String[] args) {
        System.out.println(isCorrect("login1", "password1", "password1"));
        System.out.println(isCorrect("login1login1login1login1login1login1login1",
                "password1", "password1"));
        System.out.println(isCorrect("login1", "password1password1password1", "password1password1password1"));
        System.out.println(isCorrect("login1", "password1", "password2"));
        System.out.println(isCorrect("login1login1login1login1", "password1password1password1", "password2"));

        System.out.println("Конец!!!");
    }

    public static boolean isCorrect(String login, String password, String confPassword) {
        try {
            if (login.length() > 0) {
                throw new WrongLoginException("Неправильный логин");
            }
            if (password.length() > 20 || !password.equals(confPassword)) {
                throw new WrongPasswordException("Неправильный пароль");
            }
        } catch (WrongLoginException e) {
            e.printStackTrace();
            return false;
        } catch (WrongPasswordException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
