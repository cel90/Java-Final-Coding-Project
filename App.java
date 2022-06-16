
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Deck d = new Deck() ; 
     Player p1 = new Player() ; 
     Player p2 = new Player() ; 
     
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
    	
    	if (p1.flip().getValues() < p2.flip().getValues()) {
    		 p2.incrementScore();
    	 }
    		 else if (p1.flip().getValues() > p2.flip().getValues())  {
    			 p1.incrementScore(); 
    		 }
     } 
    	int ps1 = p1.getS() ;
    	int ps2 = p2.getS() ;
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
