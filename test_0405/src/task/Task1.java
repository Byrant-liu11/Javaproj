package task;

public class Task1 {
    public static boolean isAdmin(String userId){
        return userId.toLowerCase()=="admin";
        //此题的关键在于执行toLowerCase()会重新new String(),==判断的是地址
    }
    public static void main(String[] args){
        System.out.println(isAdmin("Admin"));
    }
}
