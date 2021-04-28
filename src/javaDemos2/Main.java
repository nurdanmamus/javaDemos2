package javaDemos2;

public class Main {

	public static void main(String[] args) {  
		// TODO Auto-generated method stub 
		
		Instructor instructor = new Instructor(1,"Engin Demiroð"); //instantiation
		Instructor[] instructors = {instructor};
		
		Course course1 = new Course();
		course1.setId(1);
		course1.setName("Yazýlým Geliþtirici Yetiþtirme Kampý(C# + Angular)");
		course1.setInstructor("Engin Demiroð"); 
		course1.setCategoryid(1);
		 
		
		Course course2 = new Course(1,"Yazýlým Geliþtirici Yetiþtirme Kampý(Java + React)","Engin Demiroð",1);
		Course course3 = new Course(1,"Programlamaya Giriþ için Temel Kurs","Engin D.",1);
		
		Course[] courses = {course1,course2 ,course3};
		
		
/*		for (Course course : courses) {
			System.out.println(course.getName());
		}
		
		for (Instructor instructor2 : instructors) {
			System.out.println(instructor2.name);
		}
*/
		Category category = new Category(1,"Programlama");
		Category[] categories = {category};
		
		//Listed Courses By Selected Category
		CategoryManager categoryManager = new CategoryManager();
		categoryManager.listCourseByCategory(courses, 1);
		
		//Listed Courses By Selected Instructor
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.listCourseByInstructor(courses, "Engin Demiroð");

	}

}
