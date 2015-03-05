public class Cycle {

	private int numberOfWheels;
	private int weight;

	public Cycle(int numberOfWheels, int weight) {
		super();
		this.numberOfWheels = numberOfWheels;
		this.weight = weight;
	}

	public Cycle(){
		this(100,1000);
	}
	
	
	public String toString() {
		return "Cycle [numberOfWheels=" + numberOfWheels + ", weight=" + weight
				+ "]";
	}

}
