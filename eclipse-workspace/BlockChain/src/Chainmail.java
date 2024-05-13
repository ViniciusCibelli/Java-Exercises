class Studant {
	
	String name;
	int grade;
	
	public Studant setName(String name) {
		this.name = name;
		return this;
	}
	
	public Studant setGrade(int grade) {
		this.grade = grade;
		return this;
	}
}

public class Chainmail {

	public static void main(String[] args) {

		/*
		String a = "Doug dimmadome";
		System.out.println(a.toLowerCase().charAt(0));
		
		
		String b = "cake";
		
		int c = b.concat(" is good").chars().toArray()[0];
		
		System.out.println(c);
		*/
		
		Studant d = new Studant();
		d.setGrade(56).setName("Pedro");
		
		System.out.println(d.name);
		System.out.println(d.grade);
		
		System.out.println(d.name + " " + d.grade);
	}
	
}
