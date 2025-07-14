import java.util.List;

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
                List.of(anna, ben)
        );

        Course deutschGrundkurs = new Course(
                "C002",
                "Deutsch – Stil & Ausdruck",
                germanTeacher,
                List.of(ben, clara)
        );

        Course englishLit = Course.builder()
                .id("C002")
                .name("English Literature")
                .teacher(englishTeacher)
                .students(List.of(ben, clara, david))
                .build();

        System.out.println("Kurse:");
        System.out.println(analysisI);
        System.out.println(deutschGrundkurs);
        System.out.println(englishLit);
    }
}
