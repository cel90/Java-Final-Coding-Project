
public class Card {
       private int values ;   //= new String[] {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"} ;
       private String names ;  //= new String[] {"Spades","Hearts","Diamonds","Clubs"} ;
	
       
       
       public Card(int v, String S ) {
    	   values = v ; 
    	   if ( v == 2) {
    		   names = "TWO" ;    
    	   }
    	   else if (v == 3 ) { 
    		   names = "Three" ;
    	   }
    	   else if (v == 4 ) { 
    		   names = "Four" ;
    	   }
    	   else if (v == 5 ) { 
    		   names = "Five" ;
    	   }
    	   else if (v == 6 ) { 
    		   names = "Six" ;
    	   }
    	   else if (v == 7 ) { 
    		   names = "Seven" ;
    	   }
    	   else if (v == 8 ) { 
    		   names = "Eight" ;
    	   }
    	   else if (v == 9 ) { 
    		   names = "Nine" ;
    	   }
    	   else if (v == 10 ) { 
    		   names = "Ten" ;
    	   }
    	   else if (v == 11 ) { 
    		   names = "Jack" ;
    	   }
    	   else if (v == 12 ) { 
    		   names = "Queen" ;
    	   }
    	   else if (v == 13 ) { 
    		   names = "King" ;
    	   }
    	   else if (v == 14 ) { 
    		   names = "Ace" ;
    	   }
    	   
 
          names = names + "of" + S ; 
       }
       
       public void describe() {
      
         	 System.out.println("This is the card:" + names + "and value of:" + values  );
			// return "This is the card:" + names + "and value of:" + values  ; 
	
       }
       
       
       
       
       
       
       
       
       
       
       public int getValues() {
		return values;
	}
	public void setValues(int values) {
		this.values = values;
	}
	public String getNames() {
		return names;
	}
	public void setNames(String names) {
		this.names = names;
	}

	

	
	
       
 


}
