#include<stdio.h>
void main()
{
	char arr[50];
	printf("Enter String:");
	scanf("%s",arr);
	int count=0;
	for(int i=0;arr[i]!='\0';i++)
	{
	 if(strchr("aeiouAEIOU", arr[i]))
		
		count++;
	}
	printf("Number of vowels in given string are: %d",count);
	
}