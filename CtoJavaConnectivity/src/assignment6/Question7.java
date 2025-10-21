package assignment6;

public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


    int mark=94;

  
    check(mark);
}

static void check(int mark)
{
    if (mark > 75)
    {
        System.out.printf("Distinction");
    }
    else if (mark > 65)
    {
    	 System.out.printf("First Class");
    }
    else if (mark > 55)
    {
    	 System.out.printf("Second Class");
    }
    else if (mark >= 40)
    {
    	System.out.printf("Pass Class");
    }
    else
    {
    	System.out.printf("Fail");
    }
	
}
}
	


