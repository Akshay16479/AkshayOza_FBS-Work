package inheritance;

public class SocialMediaAc {
	String username;
	String email;
	String country;
	
	SocialMediaAc()
	{
		 username="abc";
		 email="abc@1245";
		 country="india";
	}
	
	SocialMediaAc(String username,String email,String country)
	{
		 this.username=username;
		 this.email=email;
		 this.country=country;
	}

	String getUsername() {
		return username;
	}

	void setUsername(String username) {
		this.username = username;
	}

	String getEmail() {
		return email;
	}

	void setEmail(String email) {
		this.email = email;
	}

	String getCountry() {
		return country;
	}

	void setCountry(String country) {
		this.country = country;
	}

	
	void display()
	{
		System.out.println("username is:"+this.username);
		System.out.println("email is:"+this.email);
		System.out.println("country is:"+this.country);

	}
	
}//class ends


class Instagram extends SocialMediaAc
{
	int followers;
	int following;
	
	Instagram()
	{
		super();
		 followers=752;
		 following=545;
	}
	
	
	Instagram(String username,String email,String country,int followers,int following )
	{
		super( username, email, country, followers, following);
		 this.followers=followers;
		 this.following=following;
	}


	int getFollowers() {
		return followers;
	}


	void setFollowers(int followers) {
		this.followers = followers;
	}


	int getFollowing() {
		return following;
	}


	void setFollowing(int following) {
		this.following = following;
	}
	
	void display()
	{
		super.display();
		System.out.println("follwers :"+this.followers);
		System.out.println("follwing:"+this.following);

	}

}//class ends


class LinkedIn extends SocialMediaAc
{
	int connections;
	
	
	LinkedIn()
	{
		super();
		connections=875;
	}
	
	LinkedIn(String username,String email,String country,int followers,int following,int connections)
	{
		super( username, email, country, followers, following,connections);
		this.connections=connections;
	}

	int getConnections() {
		return connections;
	}

	void setConnections(int connections) {
		this.connections = connections;
	}
	
	void display()
	{
		super.display();
		System.out.println("connections :"+this.connections);

	}
	
}//class ends

class testMedia{
	public static void main(String[] args) {
		SocialMediaAc sm1=new SocialMediaAc();
		sm1.display();
		
		Instagram i1=new Instagram();
		i1.display();
		
		LinkedIn l1=new LinkedIn();
		l1.display();
	}
}