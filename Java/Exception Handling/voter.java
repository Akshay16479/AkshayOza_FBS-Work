package practiceworkjava;

//exception creation

public class voter {
             int age;

			voter(int age) {   //para constructor
				this.age = age;
			}
 
    void validate()
    {
    	if(this.age<18) 
    	{
    		try {
  
    		throw new InvalidAgeException();
    		} catch (InvalidAgeException a) {
    			System.out.println(a);
    		}
    	}
    	
    	
    	else
    	{
    		System.out.println("you can vote");
    	}
    	
    }
   
}



//exception creation

 public class testCanVote {
	public static void main(String[] args) {
		voter v1=new voter(17);
		v1.validate();
	}
}

