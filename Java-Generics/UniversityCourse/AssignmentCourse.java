package UniversityCourse;

public class AssignmentCourse implements CourseType {
    private String courseName;

    public AssignmentCourse(String courseName) {
        this.courseName = courseName;
    }

	@Override
    public void showCourseType() {
        System.out.println("Assignment-based course: " + courseName);
    }
}
