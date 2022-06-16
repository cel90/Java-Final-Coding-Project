import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
// import java.util.Random;

public class Deck {
   //private static Card[] Deck = new Card[52] ;
   
   List<Card> cardList = new ArrayList<Card>() ;
   List<String> names = new ArrayList<String>() ;
   

   public Deck() {
	  names.add("Spades");
	names.add("Hearts");
	 names.add("Diamonds");
	 names.add("Clubs");
	   
	   for (int i = 0 ; i < 4 ; i++) {
		 
		 for(int va=2 ; va<15 ; va++) {
			   cardList.add(new Card(va , names.get(i) ));
		  }
	   }
	   
	
	   
   }
   

   public void Shuffle() {
	   Collections.shuffle(cardList) ;   
   }
  
   
public Card draw () {
	
	return cardList.remove(0);
	
}
}
