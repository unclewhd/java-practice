import java.util.Comparator;

class Card implements Comparable<Card>{
    int rank;
    public Card(int rank){
        this.rank = rank;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj==null||! (obj instanceof Card)){
            return false;
        }
        Card c = (Card)obj;
        return rank==c.rank;
    }

    @Override
    public int compareTo(Card o) {
        if(o==null){
            return 1;
        }
        return rank - o.rank;
    }
}

class CardComparator implements Comparator<Card>{

    @Override
    public int compare(Card o1, Card o2) {
        if(o1 == o2){
            return 0;
        }
        if(o1 == null){
            return -1;
        }
        if(o2 ==null){
            return 1;
        }
        return o1.rank-o2.rank;
    }
}
public class Main {
    public static void main(String[] args) {
        Card p = new Card(1);
        Card q = new Card(3);
        CardComparator cc = new CardComparator();
        System.out.println(cc.compare(p, null));
//        System.out.println(p.compareTo(q));
    }
}
