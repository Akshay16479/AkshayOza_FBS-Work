#include <stdio.h>
int a,b,c;
void triangleType();
void main()
{

	printf("Enter three sides of a triangle");
	scanf("%d%d%d",&a,&b,&c);
	triangleType();
}

void triangleType()
{

    if(a==b&&b==c)
	printf("Triangle is Equilateral Triangle");
	
	else if(a==b&&b!=c||b==c&&c!=a||a==c&&c!=b)
    printf("Triangle is Isosceles Triangle");
	
	else
    printf("Triangle is Scalene Triangle");
	
}
