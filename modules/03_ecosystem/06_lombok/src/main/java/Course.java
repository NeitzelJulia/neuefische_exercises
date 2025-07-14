import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

import java.util.List;

@Value
@AllArgsConstructor
@Builder
public class Course {

    private String id;
    private String name;
    private Teacher teacher;
    private List<Enrollment> enrollments;

}
