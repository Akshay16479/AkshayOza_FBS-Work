package inheritance;

public class Farmer {
	int fid;
	String fname;
	double landarea;
	double income;
	
	Farmer()
	{
		 fid=101;
		 fname="abc";
		 landarea=17;
		 income=50000;
		
	}
	
	Farmer(int fid,	String fname,double landarea,double income)
	{
		this.fid=fid;
		this.fname=fname;
		this.landarea=landarea;
		this.income=income;
		
	}

	int getFid() {
		return fid;
	}

	void setFid(int fid) {
		this.fid = fid;
	}

	String getFname() {
		return fname;
	}

	void setFname(String fname) {
		this.fname = fname;
	}

	double getLandarea() {
		return landarea;
	}

	void setLandarea(double landarea) {
		this.landarea = landarea;
	}

	double getIncome() {
		return income;
	}

	void setIncome(double income) {
		this.income = income;
	}

	
	void display()
	{
		System.out.println("fid is:"+this.fid);
		System.out.println("name is:"+this.fname);
		System.out.println("land area is:"+this.landarea);
		System.out.println("income is:"+this.income);

	}
	
}//class ends


class DairyFarmer extends Farmer 
{
	int cattles;
	int milkProducedPerDay;
	
	DairyFarmer()
	{
		super();
		 cattles=50;
		 milkProducedPerDay=74;
	}
	
	DairyFarmer(int fid,String fname,double landarea,double income,int cattles,int milkProducedPerDay)
	{
		super(fid, fname, landarea, income, cattles, milkProducedPerDay);
		 this.cattles=cattles;
		 this.milkProducedPerDay=milkProducedPerDay;
	}

	int getCattles() {
		return cattles;
	}

	void setCattles(int cattles) {
		this.cattles = cattles;
	}

	int getMilkProducedPerDay() {
		return milkProducedPerDay;
	}

	void setMilkProducedPerDay(int milkProducedPerDay) {
		this.milkProducedPerDay = milkProducedPerDay;
	}
	
	void display()
	{
		super.display();
		System.out.println("cattles :"+this.cattles);
		System.out.println("milkProducedPerDay :"+this.milkProducedPerDay);
	}
	
}//class ends here


class PoultryFarmer extends Farmer
{
		int chickens;
		int eggProduced;
		
		PoultryFarmer()
		{
			super();
			 chickens=152;
			 eggProduced=341;
		}
		
		PoultryFarmer(int fid,String fname,double landarea,double income,int cattles,int milkProducedPerDay,int chickens,int eggProduced)
		{
			super(fid, fname, landarea, income, cattles, milkProducedPerDay,chickens,eggProduced);
			 chickens=152;
			 eggProduced=341;
		}

		int getChickens() {
			return chickens;
		}

		void setChickens(int chickens) {
			this.chickens = chickens;
		}

		int getEggProduced() {
			return eggProduced;
		}

		void setEggProduced(int eggProduced) {
			this.eggProduced = eggProduced;
		}
		
		void display()
		{
			super.display();
			System.out.println("chickens :"+this.chickens);
			System.out.println("eggProduced :"+this.eggProduced);
		}
		
}//class ends here
		

class testFarmer{
	public static void main(String[] args) {
		Farmer f1=new Farmer();
		f1.display();
		
		f1=new DairyFarmer();
		f1.display();
		
		f1=new PoultryFarmer();
		f1.display();
		
	}
}
