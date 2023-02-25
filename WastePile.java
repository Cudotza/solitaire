import java.util.ArrayList;

public class WastePile {

    private ArrayList<Card> cards;
    
    public WastePile() {
        cards = new ArrayList<Card>();
    }
    public void placeCard(Card c) {
        this.cards.add(c);

    }

    public Card getTopCard() {
        if(this.cards.size() < 1) {
            return null;
        }
        return this.cards.get(this.cards.size() -1);
    }

    public Card takeTopCard() {
        if (this.cards.size() < 1) {
            return null;
    }
    return this.cards.remove(this.cards.size() -1);
    }

    public String toString() {
        Card c = this.getTopCard();
        if(c != null && c.isFaceUp()) {
            return c.toString();

        } else
            return "XXX";        
        }
    }
