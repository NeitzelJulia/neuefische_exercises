import java.util.List;

public class Main {

    public static void main(String[] args) {

        Student anna   = new Student("S001", "Anna Müller", "Birkenweg 12");
        Student ben    = new Student("S002", "Ben Schulz",  "Lindenstraße 5");
        Student clara  = new Student("S003", "Clara Lange", "Ahornweg 8");

        Teacher mathTeacher    = new Teacher("T001", "Dr. Schneider", "Mathematik");
        Teacher germanTeacher  = new Teacher("T002", "Frau Wagner",   "Deutsch");

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

        System.out.println("Kurse:");
        System.out.println(analysisI);
        System.out.println(deutschGrundkurs);
    }
}
