#include <stdio.h>

void main()
{
	int a,b,c;
	
	printf("Enter three sides of a triangle");
	scanf("%d%d%d",&a,&b,&c);
	
	if(a==b&&b==c)
	{
		printf("Triangle is Equilateral Triangle");
	}
	else if(a==b&&b!=c||b==c&&c!=a||a==c&&c!=b)
	{ 
	    printf("Triangle is Isosceles Triangle");
	}
	
    else
    {
        printf("Triangle is Scalene Triangle");
	}


	
	
	
}
