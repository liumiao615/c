import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Play {
    public static final String[] COLORS={"♣","♠","♦","♥"};
    private static List<Card> buyDeck(){
        List<Card> deck=new ArrayList<>(52);
        for(int i=0;i<4;i++){
            String color=COLORS[i];
            for(int j=1;j<=13;j++){
                int value=j;

                Card card=new Card(value,color);
                deck.add(card);
            }
        }
        return deck;
    }
    private static void shuffle(List<Card> deck){
        Random random=new Random(20190412);
        for(int i=deck.size()-1;i>0;i--){
            int r=random.nextInt(i);
            swap(deck,i,r);
        }
    }
    private static void swap(List<Card> deck,int i,int r){
        Card t=deck.get(i);
        deck.set(i,deck.get(r));
        deck.set(r,t);
    }
    private static void send(List<List<Card>> hands,List<Card> deck,int numperson,int numcard){
        for(int k=0;k<numperson;k++){
            hands.add(new ArrayList<>());
        }
        for(int i=0;i<numcard;i++){
            for(int j=0;j<numperson;j++){
                Card card=deck.remove(0);
                hands.get(j).add(card);
            }
        }
    }
    public static void main(String[] args) {
        List<Card> deck=buyDeck();
        System.out.println("刚买回来的牌：");
        System.out.println(deck);
        shuffle(deck);
        System.out.println(deck);
        List<List<Card>> hands=new ArrayList<>();
        send(hands,deck,3,5);
        System.out.println(hands.get(0));
        System.out.println(hands.get(1));
        System.out.println(hands.get(2));
        System.out.println(deck);

    }
}
