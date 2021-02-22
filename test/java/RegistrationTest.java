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

    @Test
    public void TestPasswordMinimumOneUpperCaseThenTrue()
    {
        UserRegistration checkname= new UserRegistration();
        boolean Result = checkname.checkPasswordRule("Sanketmore");
        Assertions.assertEquals(true, Result);
    }
    @Test
    public void TestPasswordMinimumOneUpperCaseThenFalse()
    {
        UserRegistration checkname= new UserRegistration();
        boolean Result = checkname.checkPasswordRule("sanketmore");
        Assertions.assertEquals(false, Result);
    }

    @Test
    public void TestPasswordMinimumOneLowerCaseThenTrue()
    {
        UserRegistration checkname= new UserRegistration();
        boolean Result = checkname.checkPasswordRule("SanketMore");
        Assertions.assertEquals(true, Result);
    }
    @Test
    public void TestPasswordMinimumOneLowerCaseThenFalse()
    {
        UserRegistration checkname= new UserRegistration();
        boolean Result = checkname.checkPasswordRule("SANKETMORE");
        Assertions.assertEquals(false, Result);
    }




}

