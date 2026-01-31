package practiceworkjava;

public class bankfund {

	double withdrawamout;

	public bankfund(double withdrawamout) {
		
		this.withdrawamout = withdrawamout;
	}
	
	
	void withdraw() {
		
		if(withdrawamout>2000)
		{
			try
			{
				throw new InsufficiantFundException();
			}
			catch(InsufficiantFundException e)
			{
				System.out.println(e);
			}
			
		}
		else
		{
			System.out.println("you can withdraw");
		}
		
		
	}
	
	
	
	
}
