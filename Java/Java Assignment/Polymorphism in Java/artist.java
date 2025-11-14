package poly;

 class Artist {

	    String name;
	    int age;
	    String field;

	    // Default Constructor
	    Artist() {
	        name = "Unknown Artist";
	        age = 0;
	        field = "General Art";
	    }

	    // Parameterized Constructor
	    Artist(String name, int age, String field) {
	        this.name = name;
	        this.age = age;
	        this.field = field;
	    }

	    // Setters
	    void setName(String name) {
	        this.name = name;
	    }

	    void setAge(int age) {
	        this.age = age;
	    }

	    void setField(String field) {
	        this.field = field;
	    }

	    // Getters
	    String getName() {
	        return name;
	    }

	    int getAge() {
	        return age;
	    }

	    String getField() {
	        return field;
	    }

	    void perform() {
	       System.out.println( "The artist performs creative acts.");
	    }

	    // Display 
	    void display() {
	        System.out.println("Artist Name : " + name);
	        System.out.println("Artist Age  : " + age);
	        System.out.println("Field  : " + field);
	    }

	} // class Artist ends here


	class Singer extends Artist {

	    String genre;

	    // Default Constructor
	    Singer() {
	        super();
	        this.genre = "Classical";
	    }

	    // Parameterized Constructor
	    Singer(String name, int age, String field, String genre) {
	        super(name, age, field);
	        this.genre = genre;
	    }

	    void perform() {
		       System.out.println( "The singer sings songs ");
	       
	    }

	    // Display 
	    void display() {
	        super.display();
	        System.out.println("Genre : " + this.genre);
	    }

	} // class Singer ends here


	class Actor extends Artist {

	    String movieType;

	    // Default Constructor
	    Actor() {
	        super();
	        this.movieType = "Drama";
	    }

	    // Parameterized Constructor
	    Actor(String name, int age, String field, String movieType) {
	        super(name, age, field);
	        this.movieType = movieType;
	    }

	    void perform() {
      System.out.println("The actor performs in movies");
}

	    // Display Method
	    void display() {
	        super.display();
	        System.out.println("Movie Type  : " + this.movieType);
	    }

	} // class Actor ends here


	
	class TestArtist {

	    public static void main(String[] args) {

	        Artist a;

	        a = new Artist();
	        a.display();
	        a.perform();
	        System.out.println();

	        a = new Singer();
	        a.display();
	        a.perform();
	        System.out.println();

	        a = new Actor();
	        a.display();
	        a.perform();

	       
	    }

	} // class TestArtist ends here
