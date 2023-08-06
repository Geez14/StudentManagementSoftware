import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    @Test
    void checkStudentFields() {
        Student st = new Student("Zuka");

        assertEquals("Zuka", st.name);
        assertEquals(1234567890L, st.regNo);
        assertEquals(33200121001L, st.rollNo);

        for(long i = 0; i < 100; i++) {
            assertEquals(33200121002L + i, new Student("Fiz").rollNo);
        }
    }
}
