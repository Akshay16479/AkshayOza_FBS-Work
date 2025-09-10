// convert hh,min,sec into total seconds

void main()
{
	
    int hh, min, sec;
    int total_seconds;

    printf("Enter time (hh mm ss): ");
    scanf("%d %d %d", &hh, &min, &sec);

    total_seconds = (hh * 3600) + (min * 60) + sec;

    printf("Total Seconds = %ld\n", total_seconds);

    
}

	

