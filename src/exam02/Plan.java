package exam02;

public class Plan {
	String company;
	String model;
	int passenger;
	
	public void Plan() {}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPassenger() {
		return passenger;
	}

	public void setPassenger(int passenger) {
		this.passenger = passenger;
	}

	public Plan(String company, String model, int passenger) {
		super();
		this.company = company;
		this.model = model;
		this.passenger = passenger;
	};
	
	
}
