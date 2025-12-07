package practiceworkjava;

 interface Racer{
	 void race();
 }
 
 abstract class Vehicle
 {
	 abstract void ride();
	 abstract void brake();
	 abstract void travel();
 }
 
 interface Product
 {
	 void buy();
	 void sell();
 }
 
 abstract class Animal
 {
	 abstract void eat();
	 abstract void walk();
 }
 
 class Sportscar extends Vehicle implements Racer,Product
 {

	
	public void race() {
		System.out.println("racing sportscar");
	}

	
	void ride() {
		System.out.println("riding sportscar");
		
	}

	
	void brake() {
		System.out.println("braking sportscar");
		
	}

	
	void travel() {
		System.out.println("travelling sportscar ");
		
	}


	
	public void buy() {
		System.out.println("buying sportscar ");
		
	}


	
	public void sell() {
		System.out.println("seling sportscar ");
		
	}
	
	
 }
 
 //subclass ends
	
 	
	
	class Horse extends Animal implements Product,Racer
	{

		
		public void race() {
			System.out.println("horse racing  ");
			
		}

		
		public void buy() {
			System.out.println("horse buying ");
			
		}

		
		public void sell() {
			System.out.println("horse selling ");
			
		}

		
		void eat() {
			System.out.println("horse eating ");
			
		}

		
		void walk() {
			System.out.println("horse walking ");
			
		}
		
	}
//subclass ends
	
	
	class Lion extends Animal
	{

		
		void eat() {
			System.out.println("lion eating ");
			
		}

		void walk() {
			System.out.println("lion walking ");
			
		}
		
	}
	//subclass ends
	
	
	class test{
		public static void main(String[] args) {
			
			Sportscar s =new Sportscar();
			s.ride();
			s.travel();
			s.brake();
			s.sell();
			s.race();
			s.buy();
			System.out.println();
			
			Horse h1=new Horse();
			h1.buy();
			h1.race();
			h1.sell();
			h1.eat();
			h1.walk();
			System.out.println();
			
			Lion l =new Lion();
			l.eat();
			l.walk();
			System.out.println();
			
		}
	}
