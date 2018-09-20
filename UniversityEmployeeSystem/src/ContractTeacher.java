
public class ContractTeacher extends TeachingStaff implements DailyWage, Schedule {

	@Override
	public void calculateSalary() {
		calculatePay();
	}

	@Override
	public void calculatePay() {
		// TODO Auto-generated method stub
		System.out.println("calculating pay");
	}

	@Override
	public void calculateDailyWage() {
		// TODO Auto-generated method stub
		System.out.println("calculating daily wage");
	}

	@Override
	public void calculateNumberOfHours() {
		// TODO Auto-generated method stub
		
	}


}
