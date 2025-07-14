import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Student anna   = new Student("S001", "Anna Müller", "Birkenweg 12");
        Student ben    = new Student("S002", "Ben Schulz",  "Lindenstraße 5");
        Student clara  = new Student("S003", "Clara Lange", "Ahornweg 8");
        Student david = Student.builder()
                .id("S004")
                .name("David König")
                .address("Finkenweg 3")
                .build();

        Teacher mathTeacher    = new Teacher("T001", "Dr. Schneider", "Mathematik");
        Teacher germanTeacher  = new Teacher("T002", "Frau Wagner",   "Deutsch");
        Teacher englishTeacher = Teacher.builder()
                .id("T002")
                .name("Mr Brown")
                .subject("Englisch")
                .build();

        Course analysisI = new Course(
                "C001",
                "Analysis I",
                mathTeacher,
                List.of(Enrollment.builder().student(anna).grade(1.7).build(),
                        Enrollment.builder().student(ben).grade(2.3).build())
        );

        Course deutschGrundkurs = new Course(
                "C002",
                "Deutsch – Stil & Ausdruck",
                germanTeacher,
                List.of(Enrollment.builder().student(ben).grade(1.9).build(),
                        Enrollment.builder().student(clara).grade(2.1).build())
        );

        Course englishLit = Course.builder()
                .id("C002")
                .name("English Literature")
                .teacher(englishTeacher)
                .enrollments(List.of(Enrollment.builder().student(ben).grade(2.5).build(),
                        Enrollment.builder().student(clara).grade(1.8).build(),
                        Enrollment.builder().student(david).grade(2.0).build()))
                .build();

        University university = new University("U001", "testUniversity", List.of(analysisI, deutschGrundkurs, englishLit));

        System.out.println("Kurse:");
        System.out.println(analysisI);
        System.out.println(deutschGrundkurs);
        System.out.print(englishLit);
        System.out.println();
        System.out.println();

        UniversityService service = new UniversityService();

        System.out.println("Durchschnittsnoten pro Kurs:");
        for (Course course : university.courses()) {
            double avg = service.calculateCourseAverageGrade(course);
            System.out.printf(" - %s: %.2f%n", course.getName(), avg);
        }

        double uniAvg = service.calculateUniversityAverageGrade(university);
        System.out.printf("%nDurchschnittsnote der %s: %.2f%n", university.name(), uniAvg);

        Set<Student> goodStudents = service.getGoodStudents(university);
        System.out.println("\nStudierende mit Note ≤ 2.0:");
        goodStudents.forEach(s ->
                System.out.printf(" - %s (%s)%n", s.getName(), s.getId())
        );
    }
}
