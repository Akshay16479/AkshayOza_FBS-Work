
public class Player {

	int jerseyNo;
	String name;
	int runs;
	int wickets;
	
	Player()
	{
		
	}

	public Player(int jerseyNo, String name, int runs, int wickets) {
		super();
		this.jerseyNo = jerseyNo;
		this.name = name;
		this.runs = runs;
		this.wickets = wickets;
	}

	public int getJerseyNo() {
		return jerseyNo;
	}

	public void setJerseyNo(int jerseyNo) {
		this.jerseyNo = jerseyNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	public int getWickets() {
		return wickets;
	}

	public void setWickets(int wickets) {
		this.wickets = wickets;
	}

	@Override
	public String toString() {
		return "Player [jerseyNo=" + jerseyNo + ", name=" + name + ", runs=" + runs + ", wickets=" + wickets + "]";
	}
	
	
}
