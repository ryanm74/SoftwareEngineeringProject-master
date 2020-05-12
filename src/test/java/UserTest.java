import ie.gmit.Student;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserTest {

    @Test
    public void getUserTest() {
        Student Mike = new Student("Tommy Curley", "22/06/1994", 25);

        String Expected = "tommycurley25";
        String Actual = Mike.getUsername();
        assertEquals(Expected, Actual);

    }
}
