import java.util.ArrayList;
import java.util.List;

public class Player {

	private List<Card> hand = new ArrayList<Card>() ; 
	 private int s;
	
	
	public Player() {
		// TODO Auto-generated constructor stub
		s = 0 ;
	}

	private String name ;
	public  Player (String n) {
		s = 0 ; 
	   name = n  ;
		
	}
	
	 public void describe() {
		 System.out.println("The Player:" + name + "with the cards" ) ;  
      	for (int i = 0 ; i < hand.size(); i++) {
      		
      	((Card) hand.get(i)).describe() ; 
     	}
   }
	
	 public Card flip () {
			
		return hand.remove(0);
			
		}
	 public void draw(Deck dd) {
			 Card dk = dd.draw() ;
			hand.add(dk) ;
			
		}
	 public void incrementScore() {
		
		s++ ;
	 }
	 //public int scr = s ;
	 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getS() {
		return s;
	}

	public void setS(int s) {
		this.s = s;
	}

	
}
