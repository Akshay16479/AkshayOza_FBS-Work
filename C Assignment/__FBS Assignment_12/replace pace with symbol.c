#include<stdio.h>
void main() {

	char arr[50];
	printf("Enter String:");
	scanf("%[^\n]",arr);


	for(int i=0; arr[i]!='\0'; i++)
	 {
		if(arr[i]==' ') 
		{
			arr[i]='#';

		}
	}
	printf("%s",arr);
}