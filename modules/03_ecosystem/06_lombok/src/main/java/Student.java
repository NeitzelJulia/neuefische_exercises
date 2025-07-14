import lombok.*;

@Data
@AllArgsConstructor
@Builder
public class Student {

    private String id;
    private String name;
    private String address;
}
