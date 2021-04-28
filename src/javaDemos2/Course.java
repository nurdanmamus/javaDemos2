package javaDemos2;

public class Course {
	
	public Course() {  
//		System.out.println("Default constructor is triggered.");
	}
	
	public Course(int id,String name, String instructor,int categoryid) {
		this.id = id;
		this.name = name;
		this.instructor = instructor;
		this.categoryid = categoryid;
	}
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the instructor
	 */
	public String getInstructor() {
		return instructor;
	}

	/**
	 * @param instructor the instructor to set
	 */
	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}

	/**
	 * @return the categoryid
	 */
	public int getCategoryid() {
		return categoryid;
	}

	/**
	 * @param categoryid the categoryid to set
	 */
	public void setCategoryid(int categoryid) {
		this.categoryid = categoryid;
	}

	private int id;
	private String name;
	private String instructor;
	private int categoryid;

}
