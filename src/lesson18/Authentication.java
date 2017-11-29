package lesson18;

public class Authentication {
    public static void main(String[] args) {
        try {
            System.out.println(isCorrect("login1", "password1", "password1"));
            System.out.println(isCorrect("login1login1login1login1login1login1login1",
                    "password1", "password1"));
            System.out.println(isCorrect("login1", "password1password1password1", "password1password1password1"));
            System.out.println(isCorrect("login1", "password1", "password2"));
            System.out.println(isCorrect("login1login1login1login1", "password1password1password1", "password2"));
        } catch (WrongLoginException e) {
            e.printStackTrace();
        } catch (WrongPasswordException e) {
            e.printStackTrace();
        }
        System.out.println("Конец!!!");
    }

    public static boolean isCorrect(String login, String password, String confPassword)
            throws WrongLoginException, WrongPasswordException {
        if (login.length() > 20) {
            throw new WrongLoginException("Неправильный логин");
        }
        if (password.length() > 20 || !password.equals(confPassword)) {
            throw new WrongPasswordException("Неправильный пароль");
        }
        return true;
    }
}
