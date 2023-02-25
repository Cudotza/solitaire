import java.util.ArrayList;
import java.util.Collections;

public class StockPile {
    
    private ArrayList<Card> cards;
    
    
    public StockPile() {
        // initialize the arraylist here
        cards = new ArrayList<Card>();

        // 52 lines like this or a loop
        for(int i = 1; i < 14; i++) {
            cards.add(new Card(i, "H"));
        } 

        for(int i = 1; i < 14; i++) {
            cards.add(new Card(i, "D"));
        } 

        for(int i = 1; i < 14; i++) {
            cards.add(new Card(i, "S"));
        }

        for(int i = 1; i < 14; i++) {
            cards.add(new Card(i, "C"));
        }
        // then shuffle it
        Collections.shuffle(cards);
    }
    


        public Card getTopCard() {
            if(this.cards.size() < 1) {
               return null;
            }
            return this.cards.get(this.cards.size() -1);
        }

        public Card takeTopCard() {
            if (this.cards.size() < 1 ){
                return null;
            }
            return this.cards.remove(this.cards.size() -1);
        }

        public String toString() {
            Card c = this.getTopCard();
            if(c == null) {
                return "XXX";
            } else
                return c.toString();
            }
        }
