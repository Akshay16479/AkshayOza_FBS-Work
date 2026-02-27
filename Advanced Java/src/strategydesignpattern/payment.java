package strategydesignpattern;

@FunctionalInterface                   //functional interface
public interface payment {
    void pay(int amount);
    
  
    default void offerDiscount()
    {
    	System.out.println("Calculate 10 % off on all UPI payments");
    	System.out.println("Do complete payment for COD");

    }
    
    static void provideInfo()
    {
    	System.out.println("Return policy is available only for 1st 10 days");
    }
    
}


//build strategies as a classes
class CashPayment implements payment
{

	@Override
	public void pay(int amount) {
		
		System.out.println("cash payment is done : " + amount);
		
		
	}
	
	
}

class UPIPayment implements payment{

	@Override
	public void pay(int amount) {
		System.out.println("upi payment is done : " + amount);
		
	}
	
	
}

//building a context class 
class PaymentContext
{
	payment mode;
	
	PaymentContext(payment mode)
	{
		this.mode=mode;
	}
	
	public void makepayment(int amount)
	{
		mode.pay(amount);
		
	}
	
	
	
}


//client code class
class ClientCode{
	public static void main(String[] args) {
		
		CashPayment cash=new CashPayment();  //strategy ka object
		PaymentContext billpay=new PaymentContext(cash);
		billpay.makepayment(50000);
	}
}



	