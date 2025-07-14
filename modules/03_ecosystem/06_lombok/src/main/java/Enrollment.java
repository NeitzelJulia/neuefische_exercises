import lombok.*;

@Data
@AllArgsConstructor
@Builder
public class Enrollment {

    private Student student;
    private double grade;
}
