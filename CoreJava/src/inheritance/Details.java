package inheritance;

public class Details {
	public static void main(String[] args) {
		
	/*	Person p1=new Person(101,"Gurjeet");
		
		SchoolPassOutPerson s1=new SchoolPassOutPerson(101,"Gurjeet","HCHS101");
		
	*/
		
CollegePassOutPerson ob=new CollegePassOutPerson(101,"Gurjeet","HCHS101","GNKHALSA102");
	
	System.out.println(ob.id+" "+ob.name+" "+ob.schoolCertificateNo+" "+ob.collegeCertificateNo);
	}

}
