/*
 * This Java source file was generated by the Gradle 'init' task.
 */


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    int add(int x, int y) {
        return x+y;
    }

    @Test
    void checkAddition() {
        assertEquals(2 + 3, add(2, 3), "2 + 3 is not add(2, 3)");
    }
}
