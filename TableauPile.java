import java.util.ArrayList;

public class TableauPile {
    private ArrayList<Card> cards;
    private StockPile stk;


    public TableauPile(StockPile stock) {
        this.stk = stock;
        cards = new ArrayList<Card>();
    }

    public boolean canPlace(Card c) {
        if(cards.size() == 0) {
            return true;
        }
        // return true if c can go on the top of this pile
        if(c.diffColor(cards.get(cards.size() - 1)) && cards.get(cards.size() -1).compareTo(c)) {
            return true;
        }
        // placeholder
        return false;
    }
    
    public Card takeTopCard() {
        if (this.cards.size() < 1) {
            return null;
        }
        return this.cards.remove(this.cards.size() -1);
    }

    public Card getTopCard() {
        if(this.cards.size() < 1) {
            return null;
        }
        return this.cards.get(this.cards.size() -1);
    }
    
    public void placeCard(Card c){
        cards.add(c);
    }
    
    public String toString() {
        String ret = "";

        for(int i = 0; i < this.cards.size(); i++) {
            ret += this.cards.get(i).toString();
        }
        return ret;
    }
}
