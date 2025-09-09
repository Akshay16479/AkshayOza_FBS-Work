#include <stdio.h>

void main()
{
	int i;
	int count=0;
	
	for(i=2;i<=25;i++)
	{
		
	if(i%2==0)
	{
	count++;
		
	if(count%3==0)
    printf("%d\n",-i);
    else
    printf("%d\n",i);
    }
						
	}
       
}

