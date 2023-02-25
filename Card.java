/**
 * Represents a playing card.
 * 
 * @author Gijs Landwehr
 */
public class Card {
    private int number;
    private String suit;
    private boolean faceUp;
    
    /**
     * Jack face cards act like a number 11
     */
    public static final int JACK = 11;
    public static final int QUEEN = 12;
    public static final int KING = 13;
    public static final int ACE = 1;
    
    /**
     * Initialize a new Card object with a number and suit.
     * 
     * @param n The number of the new Card object
     * @param s The suit of the new Card Object
     */
    public Card(int n, String s) {
        this.number = n;
        this.suit = s;
        this.faceUp = true;
    }
    
    /**
     * Get the numeric value of this Card object.
     * 
     * @return the number of this Card
     */
    public int getNumber() {
        return this.number;
    }
    
    /**
     * Get the suit of this Card object
     * 
     * @return the suit of this Card
     */
    public String getSuit() {
        return this.suit;
    }

    /**
     * Check if this Card is face up or not
     * 
     * @return true if the card is face up, false if it is face down
     */
    public boolean isFaceUp() {
        return this.faceUp;
    }

    /**
     * Flip this Card over. If it was face up, make it face down. If it was face
     * down, make it face up.
     */
    public void flip() {
        this.faceUp = !this.faceUp;
    }

    /**
     * Create a String representation of this Card object. The String is of the 
     * format number " of " suit.
     * 
     * @return the String representation
     */
    public String toString() {
        if (this.faceUp) {
            return String.format("%02d%s", this.number, this.suit);//this.number + this.suit;
        } else {
            return "XXX";
        }
    }
    
    /**
     * Get the numeric value of a face card type by name.
     * 
     * @param n The face card type to get the numeric value of
     * @return 11 for Jack cards, 12 for Queen cards, 13 for King cards, and
     *         1 for Ace cards.
     */
    public static int nameToValue(String n) {
        if (n.toLowerCase().equals("jack")) {
            return JACK;
        } else if (n.toLowerCase().equals("queen")) {
            return QUEEN;
        } else if (n.toLowerCase().equals("king")) {
            return KING;
        } else if (n.toLowerCase().equals("ace")) {
            return ACE;
        }
        
        return 0;
    }
    
    
    public boolean isRed() {
        if(suit == "D" || suit == "H") {
            return true;
        } 
        return false;
}

    public boolean diffColor(Card x) {
        return this.isRed() != x.isRed();
    }

    public boolean compareTo(Card x) {
        return this.getNumber() - x.getNumber() == 1;
    }


    public boolean suitsSame(Card c) {
        return (this.getSuit().equals(c.getSuit())) ;
    }

}
