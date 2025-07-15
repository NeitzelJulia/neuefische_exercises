import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {

    private final StudentService service = new StudentService();

    @Test
    void getStudentById_ThrowsException_WhenIdNotExists() {
        String missingId = UUID.randomUUID().toString();

        assertThrows(StudentNotFoundException.class, () -> service.getStudentById(missingId));
    }

}