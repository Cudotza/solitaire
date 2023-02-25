import java.util.Scanner;

public class Solitaire {
    private StockPile stock;
    private WastePile waste;
    private Foundation foundation;
    private Tableau tableau;
    
    private int turns;
    
    private Scanner sc;
    
    public Solitaire() {
        sc = new Scanner(System.in);
        foundation = new Foundation();
        waste = new WastePile();
        stock = new StockPile();
        tableau = new Tableau(stock);
    }
    
    // after you test the individual pieces, game and turn logic in this class
    // logic for winning the game should go here
    
    public void takeTurn() {
        System.out.println(this);
        
        System.out.print("Enter from location: ");
        String from = this.sc.nextLine();
        
            System.out.print("Enter to location: ");
            String to = this.sc.nextLine();
            
            // maybe move multiple at once, start with one at a time
            
            Card c = null;
            if ("T0".equals(from)) {
                c = tableau.getTopCard(0);
            } 
            
            else if ("FH".equals(from)) {
                c = foundation.getTopCard(0);
            } 
            
            else if ("T1".equals(from)) {
                c = tableau.getTopCard(1);
            } 
            
            else if ("FS".equals(from)) {
                 c = foundation.getTopCard(1);
            } 
            
            else if ("T2".equals(from)) {
                c = tableau.getTopCard(2);
            } 
            
            else if ("FD".equals(from)) {
                 c = foundation.getTopCard(2);
            } 
            
            else if ("T3".equals(from)) {
                c = tableau.getTopCard(3);
            } 
            
            else if ("FC".equals(from)) {
                 c = foundation.getTopCard(3);
            } 
            
            else if ("T4".equals(from)) {
                c = tableau.getTopCard(4);
            } 
            
            else if ("T5".equals(from)) {
                c = tableau.getTopCard(5);
            } 
            
            else if ("T6".equals(from)) {
                c = tableau.getTopCard(6);
            } 
            
            else if ("stk".equals(from)) {
                c = stock.getTopCard();
            }
            
            // check if Card c can go on the to pile
            
            boolean canMove = false;
            if ("T0".equals(to)) {
                canMove = tableau.canPlace(c, 0);
            } 
            
            else if ("T1".equals(to)) {
                canMove = tableau.canPlace(c, 1);
            } 
            
            else if ("T2".equals(to)) {
                canMove = tableau.canPlace(c, 2);
            }

            else if ("T3".equals(to)) {
                canMove = tableau.canPlace(c, 3);
            }
            
            else if ("T4".equals(to)) {
                canMove = tableau.canPlace(c, 4);
            }

            else if ("T5".equals(to)) {
                canMove = tableau.canPlace(c, 5);
            }

            else if ("T6".equals(to)) {
                canMove = tableau.canPlace(c, 6);
            }

            else if ("FH".equals(to)) {
                canMove = tableau.canPlace(c, 0);
            }

            else if ("FS".equals(to)) {
                canMove = tableau.canPlace(c, 1);
            }

            else if ("FD".equals(to)) {
                canMove = tableau.canPlace(c, 2);
            }

            else if ("FC".equals(to)) {
                canMove = tableau.canPlace(c, 3);
            }

            // if the card can move, go ahead and move it
            if ("T0".equals(from)) {
                c = tableau.takeTopCard(0);
            } else if ("FH".equals(from)) {
                c = foundation.takeTopCard(0);
            } else if ("T1".equals(from)) {
                c = tableau.takeTopCard(1);
            } else if ("T2".equals(from)) {
                c = tableau.takeTopCard(2);
            } else if ("T3".equals(from)) {
                c = tableau.takeTopCard(3);
            } else if ("T4".equals(from)) {
                c = tableau.takeTopCard(4);
            } else if ("T5".equals(from)) {
                c = tableau.takeTopCard(5);
            } else if ("T6".equals(from)) {
                c = tableau.takeTopCard(6);
            } else if ("FD".equals(from)) {
                c = foundation.takeTopCard(2);
            } else if ("FS".equals(from)) {
                c = foundation.takeTopCard(1);
            } else if ("FC".equals(from)) {
                c = foundation.takeTopCard(3);
            } else if("stk".equals(from)) {
                c = stock.takeTopCard();
            } 
            
            if ("T0".equals(to)) {
               tableau.placeCard(c, 0);
            } else if ("T1".equals(to)) {
                tableau.placeCard(c, 1);
            } else if ("T2".equals(to)) {
               tableau.placeCard(c, 2);
            } else if ("T3".equals(to)) {
                tableau.placeCard(c, 3);
            } else if ("T4".equals(to)) {
                tableau.placeCard(c, 4);
            } else if ("T5".equals(to)) {
                 tableau.placeCard(c, 5);
            } else if ("T6".equals(to)) {
                 tableau.placeCard(c, 6);
            } else if ("FH".equals(to)) {
                  tableau.placeCard(c, 1);
            } else if ("FD".equals(to)) {
                  tableau.placeCard(c, 2);
            } else if ("FS".equals(to)) {
                  tableau.placeCard(c, 1);
            } else if ("FC".equals(to)) {
                  tableau.placeCard(c, 3);
            } 
    }
    
    public boolean isFinished() {
        return this.foundation.isFull();
    }
    
    public String toString() {
    String thing = "";
    thing += this.stock.toString() + "  "  + this.waste.toString() + "    " + this.foundation.toString() + "\n";
    thing += "stk" + " " + "www" + "    " + "FH" + "  " + "FS" + "  " + "FD" + "  " + "FC" + "\n";
    thing += "\n";
    thing += this.tableau.toString();
        return thing;
    }
}
