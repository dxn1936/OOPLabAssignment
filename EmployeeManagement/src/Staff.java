
public abstract class Staff {
	protected String name;
	
	public abstract void calculateSalary();
	
	public void teach() {
		System.out.println("staff teaching now");
	}
	
	public Staff() {
		name = "";
	}
	public Staff(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
