
public class NonTeachingStaff extends Staff {
	private Integer noOfAdminLeaves;
	
	public NonTeachingStaff() {
		super();
		noOfAdminLeaves = 0;
	}
	
	public NonTeachingStaff(String name, Integer noOfAdminLeaves) {
		super(name);
		this.noOfAdminLeaves = noOfAdminLeaves;
	}

	@Override
	public void calculateSalary() {
		System.out.println("non teaching salary");
	}
}
