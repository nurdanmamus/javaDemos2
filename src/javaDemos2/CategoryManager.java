package javaDemos2;

public class CategoryManager { 
	
	//Listing courses by selected category
	public static void listCourseByCategory(Course courses[], int categoryid) {
		
		for (Course course : courses) {
			if (course.getCategoryid() == categoryid) {
				System.out.println(course.getName()); 
			}		
		}
	}

}
