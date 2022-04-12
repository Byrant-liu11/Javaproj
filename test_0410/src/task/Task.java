package task;

public class Task {
    private static String userName = "admin";
    private static String passWorld = "12345";

    public static void main(String[] args) {
        try {
            login("admin", "12345");
        } catch (UserError userError) {
            userError.printStackTrace();
        } catch (PasswordError passwordError) {
            passwordError.printStackTrace();
        }
    }

    public static void login(String admin, String s) throws UserError, PasswordError {
        if (!Task.userName.equals(userName)) {
            throw new UserError("用户名错误");
        }
        if (!Task.passWorld.equals(passWorld)) {
            throw new PasswordError("密码错误");
        }
        System.out.println("登陆成功");
    }
}

