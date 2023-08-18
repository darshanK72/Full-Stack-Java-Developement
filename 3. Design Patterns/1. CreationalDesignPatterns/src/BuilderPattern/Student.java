package BuilderPattern;

public class Student {
	
	private int roll_no;
	private String first_name;
	private String last_name;
	private float marks;
	private char div;
	
	private Student(StudentBuilder builder) {
		this.roll_no = builder.roll_no;
		this.first_name = builder.first_name;
		this.last_name = builder.last_name;
		this.marks = builder.marks;
		this.div = builder.div;
	}

	public static class StudentBuilder
	{
		private int roll_no;
		private String first_name;
		private String last_name;
		private float marks;
		private char div;
		
		public StudentBuilder setRoll_no(int roll_no) {
			this.roll_no = roll_no;
			return this;
		}
		public StudentBuilder setFirst_name(String first_name) {
			this.first_name = first_name;
			return this;
		}
		public StudentBuilder setLast_name(String last_name) {
			this.last_name = last_name;
			return this;
		}
		public StudentBuilder setMarks(float marks) {
			this.marks = marks;
			return this;
		}
		public StudentBuilder setDiv(char div) {
			this.div = div;
			return this;
		}
		
		public Student build()
		{
			return new Student(this);
		}
		
	}

	@Override
	public String toString() {
		return "Student [roll_no=" + roll_no + ", first_name=" + first_name + ", last_name=" + last_name + ", marks="
				+ marks + ", div=" + div + "]";
	}
	
	

}
