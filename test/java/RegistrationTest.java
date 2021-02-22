import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RegistrationTest
{
    @Test
    public void TestPasswordIsMinimumEightDigitThenTrue()
    {
        UserRegistration checkname= new UserRegistration();
        boolean Result = checkname.checkPasswordRule("Sanketmore");
        Assertions.assertEquals(true, Result);
    }
    @Test
    public void TestPasswordIsMinimumEightDigitThenfalse()
    {
        UserRegistration checkname= new UserRegistration();
        boolean Result = checkname.checkPasswordRule("Sanket");
        Assertions.assertEquals(false, Result);
    }

}

