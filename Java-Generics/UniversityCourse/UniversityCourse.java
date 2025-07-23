package UniversityCourse;

import java.util.*;

public class UniversityCourse {
    public static void main(String[] args) {
        List<CourseType> courses = new ArrayList<>();
        courses.add(new ExamCourse("Mathematics"));
        courses.add(new AssignmentCourse("Software Engineering"));
        courses.add(new ResearchCourse("AI Research"));

        System.out.println("Available Courses:");
        Course.showAllCourses(courses);

        System.out.println("\nDisplaying a specific course:");
        Course<ExamCourse> examCourse = new Course<>(new ExamCourse("Physics"));
        examCourse.displayCourse();
    }
}
