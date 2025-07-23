package UniversityCourse;

public class ExamCourse implements CourseType {
    private String courseName;

    public ExamCourse(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public void showCourseType() {
        System.out.println("Exam-based course: " + courseName);
    }
}
