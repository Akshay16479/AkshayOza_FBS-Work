#include <stdio.h>
void main()
{
	int i=0,j=0,k=0;
	for( i=1;i<=5;i++)
  	{  
	    for(k=1;k<=i;k++)
  	      { 
  		  printf(" ");
	      } 
	    
		for(j=5;j>=i;j--)
		  {
			printf(" *");
		  }
		printf("\n");
	}	
}
