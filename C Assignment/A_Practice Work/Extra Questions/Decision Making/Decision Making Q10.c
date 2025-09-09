#include <stdio.h>

void main()
{
	int i,j,num,p=0;
	printf("Enters Number :");
	scanf("%d",&num);
  
   for(i=1;i<=num;i++)
   {
   	p=p*10+1;
   	
   	printf("%d",p);
   	printf(",");
   	
   }
      
         
}

