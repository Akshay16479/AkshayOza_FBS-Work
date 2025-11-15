package abstraction;

abstract public class MusicalInstrument {

		    String name;
		    String type;

		    // Default Constructor
		    MusicalInstrument() {
		        System.out.println("MusicalInstrument Default Constructor");
		        name = "Unknown Instrument";
		        type = "Unknown Type";
		    }

		    // Parameterized Constructor
		    MusicalInstrument(String name, String type) {
		        System.out.println("MusicalInstrument Parameterized Constructor");
		        this.name = name;
		        this.type = type;
		    }

		    // Setters
		    void setName(String name) {
		        this.name = name;
		    }

		    void setType(String type) {
		        this.type = type;
		    }

		    // Getters
		    String getName() {
		        return name;
		    }

		    String getType() {
		        return type;
		    }

		    abstract void playSound();
		    

		    
		    public String toString()
		    {
		    	return "Instrument Name : " + this.name + "Instrument Type : " + this.type  + "\n" ;
		    }
		    
		    
		} // class MusicalInstrument ends here



		class Guitar extends MusicalInstrument {

		    int numberOfStrings;

		    // Constructor
		    Guitar(String name, String type, int numberOfStrings) 
		    {
		        super(name, type);
		        this.numberOfStrings = numberOfStrings;
		    }

		    void playSound() 
		    {
		        System.out.println( this.name + "sounds melodiously using chords ");
		    }

		    // Display
		    
		    
		    public String toString()
		    {
		    	return super.toString() +  "Number of Strings: " + this.numberOfStrings  + "\n" ;
		    }
		    
		} // class Guitar ends here



		
		class Piano extends MusicalInstrument {

		    int numberOfKeys;

		    // Constructor
		    Piano(String name, String type, int numberOfKeys) 
		    {
		        super(name, type);
		        this.numberOfKeys = numberOfKeys;
		    }

		    void playSound() 
		    {
		        System.out.println( this.name + " plays beautiful notes ");
		    }

		   
		    
		    public String toString()
		    {
		    	return super.toString() +  "Number of Keys: " + this.numberOfKeys  + "\n" ;
		    }
		    
		} // class Piano ends here



		class TestInstrument {

		    public static void main(String[] args) {

		        MusicalInstrument m;

		        //m = new MusicalInstrument("Generic Instrument", "Unknown");
		       //m.display();
		        //m.playSound();
		        //System.out.println();

		        m = new Guitar("Fender", "String", 6);
		       System.out.println(m.toString());
		        m.playSound();
		        System.out.println();

		        m = new Piano("Yamaha", "Keyboard", 88);
			       System.out.println(m.toString());
		        m.playSound();
		        System.out.println();

		        
		    }
		} // class TestInstrument ends here