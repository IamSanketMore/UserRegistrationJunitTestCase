import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RegistrationTest
{
    @Test
    public void TestFirstNameValidThenTrue()
    {
        UserRegistration checkname= new UserRegistration();
        boolean Result = checkname.lastNameValid("More");
        Assertions.assertEquals(true, Result);
    }
    @Test
    public void TestFirstNameValidThenfalse()
    {
        UserRegistration checkname= new UserRegistration();
        boolean Result = checkname.lastNameValid("more");
        Assertions.assertEquals(false, Result);
    }
    @Test
    public void TestFirstNameThreeMinimumTrue()
    {
        UserRegistration checkname= new UserRegistration();
        boolean Result = checkname.lastNameValid("More");
        Assertions.assertEquals(true, Result);
    }
    @Test
    public void TestFirstNameThreeMinimumFalse()
    {
        UserRegistration checkname= new UserRegistration();
        boolean Result = checkname.lastNameValid("Mo");
        Assertions.assertEquals(false, Result);
    }
}
