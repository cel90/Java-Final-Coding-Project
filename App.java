
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Deck d = new Deck() ; 
     Player p1 = new Player("1") ; 
     Player p2 = new Player("2") ; 
     Card c = new Card(3 , "Spades") ;
     d.Shuffle();
     
     for (int i = 0 ; i < 52 ; i++) {
    	 if ( i % 2 != 0 ) {
    	 p2.draw(d);
    	 }
    	 else {
    	 p1.draw(d);
    	 }
     }
     for (int i=0 ; i< 26 ; i ++ ) {
         Card p1c = p1.flip() ; 
         Card p2c = p2.flip() ;
    	 if (p1c.getValues() <  p2c.getValues()) {
    	        p2.incrementScore();
    	 }else {
    			 p1.incrementScore(); 
    		 }
     } 
    	int ps1 = p1.getS() ;
    	int ps2 = p2.getS() ;
    	System.out.println(c.describe());
    	System.out.println("P1: " + ps1);
    	System.out.println("P2: " + ps2);
    	
    	 if (ps1 > ps2 ) {
    		 System.out.println("the winner is player 1") ;
    		 
    	 }
    	 else if (ps2 > ps1) {
    		 System.out.println("the winner is player 2") ; 
    	 }
    	 else  {
    		 System.out.println("Draw") ;
    	 }
     
     
	}

}
