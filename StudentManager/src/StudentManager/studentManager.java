package StudentManager;
	import java.io.*;
	import java.util.ArrayList;
	import java.util.List;
public class studentManager {

		// Create an ArrayList to hold the student objects
		List<student> students;
		private static final String DB_FILE_NAME = "studentsDB.ser";
		
		// Constructor - instantiate students ArrayList
		public studentManager() {
			// Creating an empty students ArrayList that contains 10 nulls
			students = new ArrayList<student>();
		}
		
//		public StudentManager(String dbFile) {
//			// Comment
//			try {
//				ObjectInputStream in = new ObjectInputStream(new FileInputStream(dbFile));
//				in.readObject();
//	    		in.close();
//	    	} catch (Exception e) {
//	    		System.out.print("[Error] Cannont save DB. Cause: ");
//	    		e.printStackTrace();
//	    	}
//		}

		public boolean add(student s) {
			try {
				return students.add(s);
			} catch (Exception error) {
				error.printStackTrace();
				return false;
			}
		}

		public boolean delete(String sid) {
			// Search for the Student by ID
			student student = getStudentByID(sid);
			// If a Student was found then delete the student
			if (student != null) {
				return students.remove(student);
			} else {
				// If no student was found Return false
				return false;
			}
		}

		public student getStudentByID(String sid) {
			// Loop over arrayList
			// for Student type elements in the students ArrayList do
			for (student student : students) {
				// No need to check for null as ArrayList is dynamic and fills holes
				if (student.getStudentId().equals(sid)) {
					return student;
				}
			}
			// Return null if sid was not found
			return null;
		}

		// Find a list of student by first name
		public List<student> getStudentsByFirstName(String fname) {
			// Create a new ArrayList to Hold Students with same names
			List<student> sameNames = new ArrayList<student>();
			// Loop over arrayList
			// for Student type elements in the students ArrayList do
			for (student student : students) {
				// If I find a student with the given first name then add to list
				if (student.getFirstName().equalsIgnoreCase(fname)) {
					sameNames.add(student);
				}
			}
			// Check if list has any students
			if (sameNames.size() > 0) {
				// If students were found then return the list
				return sameNames;
			}
			// If no students were found with that first name then return null
			return null;
		}

		public int findTotalStudents() {
			// returns the current number of Students in the ArrayList
			return students.size();
		}
		
		public void saveDBToFile() {
	    	try {
	    		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(DB_FILE_NAME));
	    		out.writeObject(this);
	    		out.close();
	    	} catch (Exception e) {
	    		System.out.print("[Error] Cannont save DB. Cause: ");
	    		e.printStackTrace();
	    	}
		}
		
	

}
