package assignment1;

public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    int basic = 4900;
	    float da, ta, hra, total;

	    if (basic <= 5000)
		{
	        da  = 0.10f * basic;  
	        ta  = 0.20f * basic;  
	        hra = 0.25f* basic;   
	    } 
		else 
		{
	        da  = 0.15f * basic;   
	        ta  = 0.25f * basic;   
	        hra = 0.30f* basic;   
	    }

	    total = basic + da + ta + hra;
		System.out.printf("%f",total);
		
	}

}
