#include <stdio.h>
void main()
{
	int no,n;
	int i;
	int count;
  printf("Enter Number:");
  scanf("%d",&n);
  printf("Prime numbers between 1 and %d are: ", n);
  
  for(no=2;no<=n;no++)
  {
  	count=0;
  
   for(i=1;i<=no;i++)
   {
   	if(no%i==0)
   	count++;
   }
   if(count==2)
   printf("%d ",no);
  }
  
  
}
