package bag_0421;

public class Card {
    //花色
    public String suit;
    //点数
    public String rank;

    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    //为了方便打印牌的内容，就可以重写toString方法

    @Override
    public String toString() {
        return "{" + this.suit + this.rank + "}";
    }
}
