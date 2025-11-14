package poly;

 class MusicalInstrument {
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

	    void playSound() 
	    {
	        System.out.println(" produces a generic musical sound.");
	    }

	    // Display 
	    void display() {
	        System.out.println("Instrument Name : " + this.name);
	        System.out.println("Instrument Type : " + this.type);
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
	        System.out.println( " sounds melodiously using chords ");
	    }

	    // Display
	    void display() {
	        super.display();
	        System.out.println("Number of Strings: " + this.numberOfStrings);
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
	        System.out.println(" plays beautiful notes ");
	    }

	    // Display
	    void display() {
	        super.display();
	        System.out.println("Number of Keys: " + this.numberOfKeys);
	    }
	} // class Piano ends here



	class TestInstrument {

	    public static void main(String[] args) {

	        MusicalInstrument m;

	        m = new MusicalInstrument("Generic Instrument", "Unknown");
	        m.display();
	        m.playSound();
	        System.out.println();

	        m = new Guitar("Fender", "String", 6);
	        m.display();
	        m.playSound();
	        System.out.println();

	        m = new Piano("Yamaha", "Keyboard", 88);
	        m.display();
	        m.playSound();
	        System.out.println();

	        
	    }
	} // class TestInstrument ends here


