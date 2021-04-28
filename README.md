# javaDemos2
javaDemos2

### Creating Category, Instructor and Course Classes
### Adding Courses using Course Class
```Java
    Course course1 = new Course();
		course1.setId(1);
		course1.setName("Yazılım Geliştirici Yetiştirme Kampı(C# + Angular)");
		course1.setInstructor("Engin Demiroğ");
		course1.setCategoryid(1); 
		 
		
		Course course2 = new Course(1,"Yazılım Geliştirici Yetiştirme Kampı(Java + React)","Engin Demiroğ",1);
		Course course3 = new Course(1,"Programlamaya Giriş için Temel Kurs","Engin D.",1);
		
		Course[] courses = {course1,course2 ,course3};
```
