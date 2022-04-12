package bag_0409;

public class Test {
    public static void main(String[] args) {
        try{
            int ret = divide(3,0);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }

    }

    public static int divide(int x,int y) throws ArithmeticException{
        if(y == 0) {
            throw new ArithmeticException("算数异常");
        }
        return x / y;
    }
}
