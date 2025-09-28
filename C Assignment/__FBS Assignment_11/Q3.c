#include <stdio.h>
void mystrcmp(char*,char*);
void main()
{
	char arr[]="Akshay";
	char brr[]="Oza";
	
	mystrcmp(arr,brr);

}

void mystrcmp(char*arr,char*brr)
{
	int i=0;
	
    while(arr[i] != '\0' && brr[i] != '\0')
	{
		if(arr[i]!=brr[i])
	{
		printf(" string not same");
		return;
    }
		i++;
	}
	if(arr[i] == '\0' && brr[i] == '\0')
        printf("Strings are SAME\n");
    else
        printf("Strings are NOT same\n");
	
	
}