package javaDemos2;

public class InstructorManager {   
	
public static void listCourseByInstructor(Course courses[], String instructor) {
		
		for (Course course : courses) {
			if (course.getInstructor() == instructor) {
				System.out.println(course.getName()); 
			}		
		}
	}

 
}
