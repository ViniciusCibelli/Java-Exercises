
public class exercise02 {

	public String company;
	
	//exercise02() {}
	
	exercise02(String newCompany) {
		company = newCompany;
	}
	
	public static void main(String[] args) {

		exercise02 x = new exercise02("Programiz");
		
		System.out.println("Company name = " + x.company);
	}
}
