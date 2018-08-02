
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Staff staff1 = new Staff();
//		TeachingStaff staff2 = new TeachingStaff();
		/*		Staff staff3 = new TeachingStaff();
		Staff staff4 = new NonTeachingStaff();
		NonTeachingStaff staff5 = new NonTeachingStaff();
		
		staff3.calculateSalary();
		staff4.calculateSalary();
		
//		staff2.teach();
		staff3.teach();
		staff4.teach();
		staff5.teach();*/
		
		Staff staff1 = new ContractTeacher();
		staff1.calculateSalary();
		
		ContractTeacher staff2 = new ContractTeacher();
		staff2.calculatePay();
	}

}
