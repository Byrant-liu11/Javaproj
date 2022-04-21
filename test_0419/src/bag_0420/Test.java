package bag_0420;

public class Test {
    public static int factorial (int N) {
        if (N < 2) {
            return N;
        }
        return factorial(N - 1) * N;
    }

    public static int fib(int N) {
        if (N == 1 || N == 2) {
            return 1;
        }
        return fib(N - 1) + fib(N - 2);
    }
    public static void main(String[] args) {
//        int ret = factorial(5);
        int ret = fib(5);
    }
}
