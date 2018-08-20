
public abstract class TeachingStaff extends Staff {
	
	private Integer noOfTeachingHours;
	
	public void teach() {
		System.out.println("teaching now");
	}
	
	public void teach(Boolean isLab) {
		System.out.println("teaching in lab now");
	}
	
	public TeachingStaff() {
		super();
		noOfTeachingHours = 0;
	}
	
	public TeachingStaff(String name, Integer noOfTeachingHours) {
		super(name);
		this.noOfTeachingHours = noOfTeachingHours;
	}

	
	

}
