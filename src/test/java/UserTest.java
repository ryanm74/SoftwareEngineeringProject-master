import ie.gmit.Student;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserTest {

    @Test
    public void getUserTest() {
        Student Peter = new Student("Peter Treacy", "13/05/1995", 25);

        String Expected = "petertreacy25";
        String Actual = Peter.getUsername();
        assertEquals(Expected, Actual);

    }
}
