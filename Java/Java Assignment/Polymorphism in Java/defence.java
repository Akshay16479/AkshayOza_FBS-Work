package poly;

 class Defencee {

		 String countryName;
		 String nameOfHead;
		 double noOftroops;
		 int noOfcasualty;
		 int noOfMissionPerformed;
		 double budget;
		 double noOfVehicle;
		 String locationOfHeadquarter;
		 
	//default
		 Defencee()
		 {
			  countryName="india";
			  nameOfHead="abc";
			  noOftroops=5222;
			  noOfcasualty=12;
			  noOfMissionPerformed=49;
			  budget=755578855;
			  noOfVehicle=9752;
			  locationOfHeadquarter="dehradun";
		 }
		 
	//parameterized
		 Defencee(String countryName,String nameOfHead,double noOftroops,int noOfcasualty,int noOfMissionPerformed,double budget,double noOfVehicle,String locationOfHeadquarter)
		 {
			  this.countryName=countryName;
			  this.nameOfHead=nameOfHead;
			  this.noOftroops=noOftroops;
			  this.noOfcasualty=noOfcasualty;
			  this.noOfMissionPerformed=noOfMissionPerformed;
			  this.budget=budget;
			  this.noOfVehicle=noOfVehicle;
			  this.locationOfHeadquarter=locationOfHeadquarter;
		 }

		 
	//setter-getter	 
		String getCountryName() {
			return countryName;
		}

		void setCountryName(String countryName) {
			this.countryName = countryName;
		}

		String getNameOfHead() {
			return nameOfHead;
		}

		void setNameOfHead(String nameOfHead) {
			this.nameOfHead = nameOfHead;
		}

		double getNoOftroops() {
			return noOftroops;
		}

		void setNoOftroops(double noOftroops) {
			this.noOftroops = noOftroops;
		}

		int getNoOfcasualty() {
			return noOfcasualty;
		}

		void setNoOfcasualty(int noOfcasualty) {
			this.noOfcasualty = noOfcasualty;
		}

		int getNoOfMissionPerformed() {
			return noOfMissionPerformed;
		}

		void setNoOfMissionPerformed(int noOfMissionPerformed) {
			this.noOfMissionPerformed = noOfMissionPerformed;
		}

		double getBudget() {
			return budget;
		}

		void setBudget(double budget) {
			this.budget = budget;
		}

		double getNoOfVehicle() {
			return noOfVehicle;
		}

		void setNoOfVehicle(double noOfVehicle) {
			this.noOfVehicle = noOfVehicle;
		}

		String getLocationOfHeadquarter() {
			return locationOfHeadquarter;
		}

		void setLocationOfHeadquarter(String locationOfHeadquarter) {
			this.locationOfHeadquarter = locationOfHeadquarter;
		}
		 
		void attack()
		{
			System.out.println("attack execution started ");
		}
			
	  
	void display()
	{
		System.out.println("country name: "+ this.countryName);
		System.out.println("name of head : "+ this.nameOfHead);
		System.out.println("no of troops : "+   this.noOftroops);
		System.out.println("no of casualty: "+ this.noOfcasualty);
		System.out.println("no of mission performed: "+ this.noOfMissionPerformed);
		System.out.println("budget : "+ this.budget);
		System.out.println("no of vehicle: "+ this.noOfVehicle);
		System.out.println("location of headquarter: "+ this.locationOfHeadquarter);
		
	}
		  
	}//class defence ends here
	 
	 
	 
	 class Army extends Defencee
	 {
		 double noOfTanks;
		 double noOfBatalion;
		 double gunners;
		 
	//default
		 Army()
		 {
			 super();
			  noOfTanks=6963;
			  noOfBatalion=45;
			  gunners=585445;
			 
		 }
		 
	//parameterized
		 Army(String countryName,String nameOfHead,double noOftroops,int noOfcasualty,int noOfMissionPerformed,double budget,double noOfVehicle,String locationOfHeadquarter,double noOfTanks,double noOfBatalion,double gunners)
		 {
			 super(countryName,nameOfHead,noOftroops,noOfcasualty,noOfMissionPerformed,budget,noOfVehicle,locationOfHeadquarter,noOfTanks,noOfBatalion,gunners);
			  noOfTanks=6963;
			  noOfBatalion=45;
			  gunners=585445;	 
		 }
		 
	//setter-getter
		double getNoOfTanks() {
			return noOfTanks;
		}

		void setNoOfTanks(double noOfTanks) {
			this.noOfTanks = noOfTanks;
		}

		double getNoOfBatalion() {
			return noOfBatalion;
		}

		void setNoOfBatalion(double noOfBatalion) {
			this.noOfBatalion = noOfBatalion;
		}

		double getGunners() {
			return gunners;
		}

		void setGunners(double gunners) {
			this.gunners = gunners;
		}
		
		void attack()
		{
			System.out.println("artiliary attack execution started ");
		}
		 
	//display
	void display()
	{
		super.display();
		System.out.println("no of tanks: "+ this.noOfTanks);
		System.out.println("no of batalions : "+ this.noOfBatalion);
		System.out.println("no of gunners : "+   this.gunners);
	}

	}//class army end

	 
	 class Navy extends Defencee
	 {
		 double noOfShip;
		 double noOfSubmarine;
		 
	//default
		 Navy()
		 {
			 super();
			  noOfShip=4558;
			  noOfSubmarine=955;
		 }
		 
	//parameterized
		 Navy(String countryName,String nameOfHead,double noOftroops,int noOfcasualty,int noOfMissionPerformed,double budget,double noOfVehicle,String locationOfHeadquarter,double noOfTanks,double noOfBatalion,double gunners,double noOfShip,double noOfSubmarine)
		 {
			 super(countryName,nameOfHead,noOftroops,noOfcasualty,noOfMissionPerformed,budget,noOfVehicle,locationOfHeadquarter,noOfTanks,noOfBatalion,gunners,noOfShip,noOfSubmarine);
	          this.noOfShip=noOfShip;
	          this.noOfSubmarine=noOfSubmarine;
		 }

		//setter-getter
		 
		double getNoOfShip() {
			return noOfShip;
		}

		void setNoOfShip(double noOfShip) {
			this.noOfShip = noOfShip;
		}

		double getNoOfSubmarine() {
			return noOfSubmarine;
		}

		void setNoOfSubmarine(double noOfSubmarine) {
			this.noOfSubmarine = noOfSubmarine;
		}
		 
		void attack()
		{
			System.out.println("missile launch attack execution started ");
		}
		
		//display
		void display()
		{
			super.display();
			System.out.println("no of ships : "+ this.noOfShip);
			System.out.println("no of submarines : "+   this.noOfSubmarine);
		}	 
		 
	 }//class navy ends
	 
	 
	 class AirForce extends Defencee
	 {
		 double noOfAircrafts;
		 	 
		AirForce()
		{
			super();
			noOfAircrafts=3598;
		}
		 
		AirForce(String countryName,String nameOfHead,double noOftroops,int noOfcasualty,int noOfMissionPerformed,double budget,double noOfVehicle,String locationOfHeadquarter,double noOfTanks,double noOfBatalion,double gunners,double noOfShip,double noOfSubmarine,double noOfAircrafts)
		{
			 super(countryName,nameOfHead,noOftroops,noOfcasualty,noOfMissionPerformed,budget,noOfVehicle,locationOfHeadquarter,noOfTanks,noOfBatalion,gunners,noOfShip,noOfSubmarine,noOfAircrafts);
			this.noOfAircrafts=noOfAircrafts;
		}

		double getNoOfAircrafts() {
			return noOfAircrafts;
		}

		void setNoOfAircrafts(double noOfAircrafts) {
			this.noOfAircrafts = noOfAircrafts;
		}
		
		void attack()
		{
			System.out.println("Fighter jet attack execution started ");
		}
		
		//display
			void display()
			{
				super.display();
				System.out.println("no of aircrafts : "+   this.noOfAircrafts);
			}	
		
	 }//class airforce end
	 
	 class testDefence{
		 public static void main(String[] args) {
			Defencee d1=new Defencee();
			d1.display();
			d1.attack();

			System.out.println();
			
			 d1=new Army();
			d1.display();
			d1.attack();
			System.out.println();

			
			 d1=new Navy();
			d1.display();
			d1.attack();
			System.out.println();
			
			 d1=new AirForce();
			d1.display();
			d1.attack();

		}
		 
	 }
	 



