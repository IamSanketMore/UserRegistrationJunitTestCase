import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RegistrationTest
{
    @Test
    public void TestPasswordIsMinimumEightDigitThenTrue()
    {
        UserRegistration checkname= new UserRegistration();
        boolean Result = checkname.checkPasswordRule("Sanket@123");
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
        boolean Result = checkname.checkPasswordRule("Sanket@123");
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
        boolean Result = checkname.checkPasswordRule("Sanket@123");
        Assertions.assertEquals(true, Result);
    }
    @Test
    public void TestPasswordMinimumOneLowerCaseThenFalse()
    {
        UserRegistration checkname= new UserRegistration();
        boolean Result = checkname.checkPasswordRule("SANKETMORE");
        Assertions.assertEquals(false, Result);
    }

    @Test
    public void TestPasswordMinimumOneNumberThenTrue()
    {
        UserRegistration checkname= new UserRegistration();
        boolean Result = checkname.checkPasswordRule("Sanket@123");
        Assertions.assertEquals(true, Result);
    }
    @Test
    public void TestPasswordMinimumOneNumberThenFalse() {
        UserRegistration checkname = new UserRegistration();
        boolean Result = checkname.checkPasswordRule("SanketMore");
        Assertions.assertEquals(false, Result);
    }
    @Test
    public void TestPasswordMinimumOneSpecialCharactersThenTrue()
    {
        UserRegistration checkname= new UserRegistration();
        boolean Result = checkname.checkPasswordRule("Sanket@123");
        Assertions.assertEquals(true, Result);
    }
    @Test
    public void TestPasswordMinimumOneSpecialCharactersThenFalse() {
        UserRegistration checkname = new UserRegistration();
        boolean Result = checkname.checkPasswordRule("sanket123");
        Assertions.assertEquals(false, Result);
    }
}

