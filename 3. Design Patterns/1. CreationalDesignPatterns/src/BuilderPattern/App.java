package BuilderPattern;

public class App {
	public static void main(String args[])
	{
		
		Student s1 = new Student.StudentBuilder().setRoll_no(101)
						.setFirst_name("Darshan")
						.setLast_name("Khairnar")
						.setDiv('A')
						.setMarks(53.63f)
						.build();
		
		System.out.println(s1);
		
	}
}
