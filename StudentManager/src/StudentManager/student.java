package StudentManager;

	import java.util.*; // For Date obj
public class student {


	public class Student{
	    private String studentId;
	    private String firstName;
	    private String surname;
	    private Date dob;
	    private address address;
	    private course course;
	    
	    public Student(String sid){
	        this.studentId = sid;
	    }
	    
	    public Student(String sid, String fname, String sname, Date dob){
	        this(sid);
	        this.firstName = fname;
	        this.surname = sname;
	        this.dob = dob;
	    }

		public String getStudentId() {
			return studentId;
		}

		public void setStudentId(String studentId) {
			this.studentId = studentId;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getSurname() {
			return surname;
		}

		public void setSurname(String surname) {
			this.surname = surname;
		}

		public Date getDob() {
			return dob;
		}

		public void setDob(Date dob) {
			this.dob = dob;
		}

		public address getAddress() {
			return address;
		}

		public void setAddress(address address) {
			this.address = address;
		}

		public course getCourse() {
			return course;
		}

		public void setCourse(course course) {
			this.course = course;
		}
		
		// Print string of student details instead of object ID
		public String toString(){
	        return new String(this.studentId + "-" + this.firstName + "-" + this.surname + "-" + this.dob);   
	    }    
	

	}

	public Object getStudentId() {
		// TODO Auto-generated method stub
		return null;
	}}
