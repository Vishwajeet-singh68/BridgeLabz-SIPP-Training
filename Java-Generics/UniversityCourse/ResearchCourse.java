package UniversityCourse;

public class ResearchCourse implements CourseType {

	private String courseName;
	
	ResearchCourse(String courseName){
		this.courseName=courseName;
	}
	
	@Override
	public void showCourseType() {
		// TODO Auto-generated method stub
		System.out.println("Research-based course: " + courseName);
	}
}
