package UniversityCourse;

import java.util.List;

public class Course<T extends CourseType> {
    T course;

    public Course(T course) {
        this.course = course;
    }

    public void displayCourse() {
        course.showCourseType();
    }

    public static void showAllCourses(List<? extends CourseType> courses) {
        for (CourseType c : courses) {
            c.showCourseType();
        }
    }
}
