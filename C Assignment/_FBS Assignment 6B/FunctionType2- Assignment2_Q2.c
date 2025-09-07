#include <stdio.h>
int TriangleType();
void main()
{
	int result;
  result=TriangleType();
  if(result==1)
  printf("Triangle is EQ");	
  else if(result==2)
  printf("Triangle is Isoscelen");
  else
  printf("Triangle is Scalene");
} 

int TriangleType()
{
	int a,b,c;
	printf("Enter three sides of a triangle");
	scanf("%d%d%d",&a,&b,&c);
	
	if(a==b&&b==c)
	return 1;
	else if(a==b&&b!=c||b==c&&c!=a||a==c&&c!=b)
    return 2;
    else
    return 3;
}
