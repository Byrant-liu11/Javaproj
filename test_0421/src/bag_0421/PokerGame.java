package bag_0421;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class PokerGame {
    //使用这个数组把四种花色都准备好
    public static final String[] suits = {"♥","♠","♣","♦"};

    private static List<Card> buyPoker() {
        List<Card> poker = new ArrayList<>();
        //外层循环处理四种花色
        for (int i = 0;i < 4;i++) {
            //里层循环处理每种花色的13张牌
            for (int j = 2;j <= 10;j++) {
                poker.add(new Card(suits[i],"" + j));
                //poker.add(new Card(suits[i],String.valueOf(j)));
            }
            poker.add(new Card(suits[i],"J"));
            poker.add(new Card(suits[i],"Q"));
            poker.add(new Card(suits[i],"K"));
            poker.add(new Card(suits[i],"A"));
        }
        poker.add(new Card("","big Joker"));
        poker.add(new Card("","small Joker"));
        return poker;
    }

    //List自身是可变对象，直接修改poker的内容就会对List本身造成影响
    //就不需要额外返回List<Card>
    private static void shuffle(List<Card> poker) {
        Random random = new Random();
        for (int i = poker.size() - 1;i > 0;i--) {
            //产生[0,i)的随机数，要和哪个位置的元素交换
            int pos = random.nextInt(i);
            swap(poker,i,pos);
        }
    }

    private static void swap(List<Card> poker, int i, int j) {
        Card tmp = poker.get(i);
        poker.set(i,poker.get(j));
        poker.set(j,tmp);
    }

    public static void main(String[] args) {
        //1.先创建一副扑克
        List<Card> poker = buyPoker();
        //System.out.println(poker);
        //2.洗牌
        //shuffle(poker);
        //实际可以使用标准库自带的库完成洗牌
        Collections.shuffle(poker);
        System.out.println(poker);
        //3.发牌，假设有三个玩家，每个玩家，给发5张牌
        //每个玩家手里有5张牌，这5张牌就使用另外一个ArrayList表示
//        List<Card> player1 = new ArrayList<>();
//        List<Card> player2 = new ArrayList<>();
//        List<Card> player3 = new ArrayList<>();
        //此时可以把这三个玩家也放到一个List中
        //players类型任然是List，泛型参数，是一个List<Card>,每个元素就是一个List<Card>
        List<List<Card>> players = new ArrayList<>();
        players.add(new ArrayList<>());
        players.add(new ArrayList<>());
        players.add(new ArrayList<>());
        for (int i = 0;i < 5;i++) {
            for (int j = 0;j < 3;j++) {
                Card top = poker.remove(0);
                List<Card> playerCard = players.get(j);
                playerCard.add(top);
            }
        }

        //4.展示手牌
        for (int i = 0;i < players.size();i++) {
            List<Card> playerCard = players.get(i);
            System.out.println("玩家" + i + "的手牌是：" + playerCard);
        }

    }
}
