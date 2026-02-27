package functionalinterface;

@FunctionalInterface
public interface TravelStrategy {
	
    void travel();

    default void abc()
    {
    	System.out.println("on upi ticket payment u can avail discount ");

    }
    
    static void pqr()
    {
    	System.out.println("complete ticket pay fast");
    }

}

//strategy class
class CarTravel implements TravelStrategy {
    public void travel() {
        System.out.println("Traveling by Car");
    }
}

class BikeTravel implements TravelStrategy {
    public void travel() {
        System.out.println("Traveling by Bike");
    }
}

class BusTravel implements TravelStrategy {
    public void travel() {
        System.out.println("Traveling by Bus");
    }
}


//context class
class GoogleMaps {
    private TravelStrategy strategy;

    public GoogleMaps(TravelStrategy strategy) {
        this.strategy = strategy;
    }

    public void startJourney() {
        strategy.travel();
    }
}

//Client Code
 class Main {
    public static void main(String[] args) {
        TravelStrategy strategy = new CarTravel();
        GoogleMaps maps = new GoogleMaps(strategy);
        maps.startJourney();;
        strategy.abc();              //default method
        TravelStrategy.pqr();        //static method
    }
}
