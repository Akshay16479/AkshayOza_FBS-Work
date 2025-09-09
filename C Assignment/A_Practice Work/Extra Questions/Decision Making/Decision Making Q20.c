#include <stdio.h>

void main()
{
    int i,p=1,a=2;
    int count=0;
                                
    for(i=1;i<=10;i++)          //enter printf and scanf if want to make code universal...
    {   
	    count++;
	    
    	if(count%2==0)
    	printf("%d\n",-p);
    	else
    	printf("%d\n",p);
    		p=p*a;
    	
	}
	  
}

