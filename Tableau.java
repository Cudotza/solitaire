public class Tableau {
    private TableauPile t0;
    private TableauPile t1;
    private TableauPile t2;
    private TableauPile t3;
    private TableauPile t4;
    private TableauPile t5;
    private TableauPile t6;
    private StockPile stk;
    private TableauPile[] piles;

    public Tableau(StockPile stock) {
        this.stk = stock;
        this.t0 = new TableauPile(stk);
        this.t1 = new TableauPile(stk);
        this.t2 = new TableauPile(stk);
        this.t3 = new TableauPile(stk);
        this.t4 = new TableauPile(stk);
        this.t5 = new TableauPile(stk);
        this.t6 = new TableauPile(stk);
        this.piles = new TableauPile[] {t0, t1, t2, t3, t4, t5, t6};
    }

    public boolean canPlace(Card c, int pile) {
        return this.piles[pile].canPlace(c);
    }
    
    public void placeCard(Card c, int pile) {
        this.piles[pile].placeCard(c);
    }
    
    public Card getTopCard(int pile) {
        return this.piles[pile].getTopCard();
    }
    
    public Card takeTopCard(int pile) {
        return this.piles[pile].takeTopCard();
    }
    
    public String toString() {
        
        String pilesBruh = "";
        pilesBruh += "T0" + "  " + t0.toString() + "\n";
        pilesBruh += "T1" + "  " + t1.toString() + "\n";
        pilesBruh += "T2" + "  " + t2.toString() + "\n";
        pilesBruh += "T3" + "  " + t3.toString() + "\n";
        pilesBruh += "T4" + "  " + t4.toString() + "\n";
        pilesBruh += "T5" + "  " + t5.toString() + "\n";
        pilesBruh += "T6" + "  " + t6.toString();
        
        
        return pilesBruh;
    }
}
