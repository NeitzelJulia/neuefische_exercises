import java.util.Set;
import java.util.stream.Collectors;

public class UniversityService {

    public double calculateCourseAverageGrade(Course course) {
        return course.getEnrollments().stream()
                .mapToDouble(Enrollment::getGrade)
                .average()
                .orElse(0.0);
    }

    public double calculateUniversityAverageGrade(University university) {
        return university.courses().stream()
                .flatMap(course -> course.getEnrollments().stream())
                .mapToDouble(Enrollment::getGrade)
                .average()
                .orElse(0.0);
    }

    public Set<Student> getGoodStudents(University university) {
        return university.courses().stream()
                .flatMap(course -> course.getEnrollments().stream())
                .filter(enrollment -> enrollment.getGrade() <= 2.0)
                .map(Enrollment::getStudent)
                .collect(Collectors.toSet());
    }
}
