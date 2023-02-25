public class Main
{
    public static void main(String[] args)
    {
        // at first, use this file to test
        // make instances of cards and piles and see that the methods are working
        // Card testCard1 = new Card(11, "S");
        // Card testCard2 = new Card(12, "D");
        // TableauPile testPile = new TableauPile();
        
        // testPile.placeCard(testCard2);
        
        // System.out.println(testPile.canPlace(testCard1));
        
        // System.out.println(testCard1);
        // System.out.println(testPile);
        
        // when it all works, call methods on the solitaire class to run the game
        
        
        Solitaire game = new Solitaire();
        
        while (!game.isFinished()) {
            game.takeTurn();
        }
        
        System.out.println("you win!");
        
    }
}
