#include <stdio.h>


void main()
{
    int a = 50, b = 20, c = 30;

    if (a > b)
  {
        if (a > c) 
		{
			
            printf("Greatest is %d\n", a);
        }
		 else 
		{
            printf("Greatest is %d\n", c);
        }
        
  }     
       else 
	    {
          if (b > c)
		   {
            printf("Greatest is %d\n", b);
        } 
		  else 
		  {
            printf("Greatest is %d\n", c);
          }
    }

    
}

