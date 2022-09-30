package javaExamples;

public class EncapsulationExample {
	
	private int studentid;
	private String studentname;	
	

	public int getStudentid() {
		return studentid;
	}


	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}


	public String getStudentname() {
		return studentname;
	}


	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EncapsulationExample caps= new EncapsulationExample();
		caps.setStudentid(45);
		caps.setStudentname("Suresh");
		
		//print the statement 
		
		System.out.println(caps.getStudentid());
		System.out.println(caps.getStudentname());

		
	}

}
