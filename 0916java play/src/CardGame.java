//import java.util.ArrayList;
//import java.util.List;
//import java.util.Random;
//
//                public class CardGame {
//                    public static String[] SUITS={"♥","♣","♦","♠"};
//
//                    private static List<Card> buyDeck(){
//                        List<Card> deck=new ArrayList<>(52);
//                        for(int i=0;i<4;i++){
//                            for(int j=1;j<=13;j++){
//                                String suit=SUITS[i];
//                                int colour=j;
//                                Card card=new Card();
//                                card.colour=colour;
//                card.suit=suit;
//
//                deck.add(card);
//            }
//        }
//        return deck;
//    }
//
//
//
//    private static void shuffle(List<Card> deck){
//        Random random=new Random(20190910);
//        for(int i=deck.size()-1;i>0;i--){
//            int r=random.nextInt(i);
//            swap(deck,i,r);
//        }
//    }
//    private static void swap(List<Card> deck,int i,int j){
//        Card a=deck.get(i);
//        deck.set(i,deck.get(j));
//        deck.set(j,a);
//    }
//
//    public static void main(String[] args) {
//        List<Card> deck=buyDeck();
//        System.out.println(deck);
//        shuffle(deck);
//        System.out.println("洗过的牌");
//        System.out.println(deck);
//        List<List<Card>> hands=new ArrayList<>();
//
//    }
//
//}
