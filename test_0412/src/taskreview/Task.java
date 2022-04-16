package taskreview;

public class Task {
    private static String userName = "admin";
    private static String passWord = "12345";

    public static void main(String[] args) {
        try {
            login("admin","123456");
        } catch (UserError userError) {
            userError.printStackTrace();
        } catch (PassWordError passWordError) {
            passWordError.printStackTrace();
        }
    }

    public static void login(String admin, String s) throws UserError,PassWordError{
        if (!Task.userName.equals(userName)) {
            throw new UserError("用户名错误");
        }
        if (!Task.passWord.equals(passWord)) {
            throw new PassWordError("密码错误");
        }
        System.out.println("登陆成功");
    }
}
