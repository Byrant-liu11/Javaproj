import java.util.Random;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        //使用方法之后的新猜数字
        while (true) {
            int choice = menu();
            if (choice == 1) {
                game();
            } else if (choice == 0) {
                System.out.println("game over");
                break;
            } else {
                System.out.println("Input Error");
                continue;
            }
        }
    }

    public static void game() {
        //生成一个1-100的随机数
        Random  random = new Random();
        int toGuess = random.nextInt(100) + 1;
        System.out.println("请输入要猜的数字：");
        while (true) {
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            if (num < toGuess) {
                System.out.println("猜小了");
            } else if (num > toGuess) {
                System.out.println("猜大了");
            } else {
                System.out.println("恭喜你，猜对了");
                break;
            }
        }
    }

    public static int menu() {
        System.out.println("################");
        System.out.println("### 1 . Play ###");
        System.out.println("####0 . Exit ###");
        System.out.println("################");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }
}
