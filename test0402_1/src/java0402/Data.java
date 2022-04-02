package java0402;

public class Data {
    public int year;
    public int month;
    public int day;

    public static int x = 10;


    public void setDay(int year,int month,int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

//    public void printDay() {
//        System.out.println(year + "/" + month + "/" + day);
//    }
//    public String toString() {
//        return this.year + "/" + this.month + "/" + this.day;
//    }

    @Override
    public String toString() {
        return "Data{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
    public static void fuc() {
        System.out.println("hello");
    }
}
