package task;

public class Task1 {
    public static int fib(int N) {
        if (N == 1 || N == 2) {
            return 1;
        }
        return fib(N - 1) + fib(N - 2);
    }

    public static void main(String[] args) {
        int ret = fib(6);
        System.out.println(ret);
    }
}
