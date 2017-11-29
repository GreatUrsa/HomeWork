package lesson18;

/**
 * Добавляем блок finally, в котором просто выводим значения  login, password и confirmPassword.
 */
public class AuthenticationFinally {
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
            if (login.length() > 20) {
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
        } finally {
            System.out.println(login);
            System.out.println(password);
            System.out.println(confPassword);
        }
        return true;
    }
}
