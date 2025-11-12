package inheritance;

 class Student {

	int fbsid;
	String name;
	int distance;
	static int count=0;

	Student(){
		System.out.println("student default constructor");

		 fbsid=100;
		 name="not given";
		 distance=120;
		 count++;
	}//default
		 
		 Student(int fbsid,String name,int distance)
		 {
				System.out.println("student parameterized constructor");

			 this.fbsid=fbsid;
			 this.name=name;
			 this.distance=distance;
			 count++;
		 }//parameterized
	

//setters and getters
	   int getFbsid() {
		return fbsid;
	}
	 void setFbsid(int fbsid) {
		this.fbsid = fbsid;
	}
	 String getName() {
		return name;
	}
	 void setName(String name) {
		this.name = name;
	}
	 int getDistance() {
		return distance;
	}
     void setDistance(int distance) {
		this.distance = distance;
	}
	static int getCount() {
		return count;
	}

	static void setCount(int count) {
		Student.count = count;
	}
   
//display
	void display()
	{
		System.out.println("firstbit id is: "+this.fbsid);
		System.out.println("firstbit name is: "+this.name);
		System.out.println("firstbit distance is: "+this.distance);

}		
}
//class Student ends 

class PlacedStudent extends Student                              //step 1(is-a)
{
	//step 2- remove andd reuse which are in super class and remove setter-getter also

	String cname;
	String designation;
	
	PlacedStudent()
	{ 
		super();     // step 4- super first line me honaa constructor me
		System.out.println("placestudent default constructor");

		 cname="xyz";
		 designation="abc";
	}//default
	
	PlacedStudent(int fbsid,String name,int distance,String cname,String designation)
	{
		super(fbsid,name,distance);     //step 4
		System.out.println("placestudent parameterized constructor");
		 this.cname=cname;
		 this.designation=designation;
	}//parameterized
	
	
//setters and getters	
	
	 String getCname() {
		return cname;
	}
	 void setCname(String cname) {
		this.cname = cname;
	}
	 String getDesignation() {
		return designation;
	}
	 void setDesignation(String designation) {
		this.designation = designation;
	}
	
//display	 
	void display()
	{
	//step-3 remove jo super me he and use super
		
		super.display();
		System.out.println("firstbit cname is: "+this.cname);
		System.out.println("firstbit designation is: "+this.designation);

	}
}//class placedStudent ends


class DemoInheritance{
	public static void main(String[] args) {
		
		Student s1 = new Student(101,"akshu",120);
          s1.display();
		 s1 = new Student(100,"Akshay",122);
		 s1.display();
      
		 s1 = new PlacedStudent(222,"akshu",130,"meta","SDE");
		 s1.display();
		
		
	}//class DemoInheritance ends here

}


