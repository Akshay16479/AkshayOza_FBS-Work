package abstraction;

abstract class Defencee {
	

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
			 
			abstract void attack();
			
				
		  
		
		
		 public String toString()
			{
				return "country name: "+ this.countryName +
						"name of head : "+ this.nameOfHead +
						"no of troops : "+   this.noOftroops +
						"no of casualty: "+ this.noOfcasualty +
						 "no of mission performed: "+ this.noOfMissionPerformed +
						 "budget : "+ this.budget + 
						   "no of vehicle: "+ this.noOfVehicle + 
						  "location of headquarter: "+ this.locationOfHeadquarter + "\n" ;
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
			 Army(String countryName,String nameOfHead,double noOftroops,int noOfcasualty,int noOfMissionPerformed,double budget,double noOfVehicle,String locationOfHeadquarter)
			 {
				 super(countryName,nameOfHead,noOftroops,noOfcasualty,noOfMissionPerformed,budget,noOfVehicle,locationOfHeadquarter);
				  this.noOfTanks=noOfTanks;
				  this.noOfBatalion=noOfBatalion;
				  this.gunners=gunners;	 
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
			 
	
		
		 public String toString()
			{
				return super.toString() +"no of tanks: "+ this.noOfTanks +
						"no of batalions : "+ this.noOfBatalion +
						"no of gunners : "+   this.gunners  + "\n" ;
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
			 Navy(String countryName,String nameOfHead,double noOftroops,int noOfcasualty,int noOfMissionPerformed,double budget,double noOfVehicle,String locationOfHeadquarter)
			 {
				 super(countryName,nameOfHead,noOftroops,noOfcasualty,noOfMissionPerformed,budget,noOfVehicle,locationOfHeadquarter);
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
			
			
			
			public String toString()
			{
				return super.toString() +"no of ships : "+ this.noOfShip +
						"no of submarines : "+   this.noOfSubmarine + "\n" ;
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
			 
			AirForce(String countryName,String nameOfHead,double noOftroops,int noOfcasualty,int noOfMissionPerformed,double budget,double noOfVehicle,String locationOfHeadquarter)
			{
				 super(countryName,nameOfHead,noOftroops,noOfcasualty,noOfMissionPerformed,budget,noOfVehicle,locationOfHeadquarter);
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
			
			
				public String toString()
				{
					return super.toString() + "no of aircrafts : "+   this.noOfAircrafts + "\n" ;
				}
				
			
		 }//class airforce end
		 
		 class testDefence{
			 public static void main(String[] args) {
				Defencee d1;

				 d1=new Army();
				System.out.println(d1.toString());
				d1.attack();
				System.out.println();

				
				 d1=new Navy();
				d1.attack();
				System.out.println(d1.toString());
				d1.attack();
				System.out.println();

				
				 d1=new AirForce();
				 System.out.println(d1.toString());
					d1.attack();

			}
			 
		 }
		 
