package assignment0;

public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

float subj1,subj2,subj3,subj4,subj5,total_score, percentage;

subj1=75.00f;
subj2=92.52f;
subj3=87.11f;
subj4=66.00f;
subj5=71.48f;

total_score=(subj1+subj2+subj3+subj4+subj5);
  percentage=(total_score/500) * 100;

System.out.printf("%f,%f",total_score, percentage);


	}

}
