#include<stdio.h>
void main()
{
	char arr[50];
	printf("Enter String:");
	scanf("%[^\n]",arr);
	int wordCount=1;
	for(int i=0;arr[i]!='\0';i++)
	{
	 if(arr[i]==' ')
		wordCount++;
	}
	printf("Number of words in given string are: %d",wordCount);
	
}