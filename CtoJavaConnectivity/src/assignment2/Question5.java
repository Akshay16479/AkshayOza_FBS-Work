package assignment2;

public class Question5 {

	public static void main(String[] args) {
		int price=650;
	    char student='Y';
	    float discount = 0.0f, final_amount;

	   
	  
	  
	  if (student == 'Y') 
	    {
	        if (price > 500)
	            discount = 0.20f * price;
	        else
	            discount = 0.10f * price;
	    } 
	    else 
	    {
	        if (price > 600)
	            discount = 0.15f * price;
	        else
	            discount = 0.0f; 
	          
	    }

	    final_amount = price - discount;

			System.out.printf("%f",final_amount);
	    
		
	}

}
