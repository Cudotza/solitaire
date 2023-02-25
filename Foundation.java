public class Foundation {
    private FoundationPile fHearts;
    private FoundationPile fSpades;
    private FoundationPile fDiamonds;
    private FoundationPile fClubs;
    private FoundationPile[] piles2;

    public Foundation() {
        this.fHearts = new FoundationPile();
        this.fSpades = new FoundationPile();
        this.fDiamonds = new FoundationPile();
        this.fClubs = new FoundationPile();

        this.piles2 = new FoundationPile[] {fHearts, fSpades, fDiamonds, fClubs};

    }

    public boolean canPlace(Card c, int suit) {
        // return true if C can be placed on the pile of suit
        // this will be some if statements calling the canPlace method of the
        // correct FoundationPile instance
        return this.piles2[suit].canPlace(c);
    }
    
    public void placeCard(Card c, int suit) {
        // after checking with other method, place c on top
        this.piles2[suit].placeCard(c);
    }
    
    public Card getTopCard(int suit) {
        // return the top card of the specific pile WITHOUT REMOVING
        return this.piles2[suit].getTopCard();
    }
    
    public Card takeTopCard(int suit) {
        // return the top card of the specific pile WITH REMOVING
        return this.piles2[suit].takeTopCard();
    }
    
    public boolean isFull() {
        return this.fHearts.isFull() && this.fSpades.isFull() && this.fDiamonds.isFull() && this.fClubs.isFull();
    }
    
    public String toString() {
        String rip = "";
        rip += fHearts.toString() + " ";
        rip += fDiamonds.toString() + " ";
        rip += fSpades.toString() + " ";
        rip += fClubs.toString();
        
        return rip;
    }
}
