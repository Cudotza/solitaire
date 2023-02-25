import java.util.ArrayList;

public class FoundationPile {
    private ArrayList<Card> cards;

    public FoundationPile() {
        this.cards = new ArrayList<Card>();
    }
    
    public boolean canPlace(Card c) {
        // return true if c can go on the top of this pile
        if(((c.suitsSame(cards.get(cards.size() - 1))) && cards.get(cards.size() -1).compareTo(c))) {
            return true;
        }
        // placeholder
        return false;
    }

    
    public void placeCard(Card c) {
        cards.add(c);
    }
    
    public boolean isFull() {
        return this.cards.size() == 13;
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
        String ret = "";

        for(int i = this.cards.size() -1; i >= 0; i--) {
            ret += this.cards.get(i);
        
     }
     return ret;
    }

}
