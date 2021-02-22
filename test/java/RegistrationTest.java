import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RegistrationTest
{
    @Test
    public void TestEmailFirstNameIsLowerCaseThenTrue()
    {
        UserRegistration checkname= new UserRegistration();
        boolean Result = checkname.emailValid("abc.xyz@bridgelabz.com.in");
        Assertions.assertEquals(true, Result);
    }
    @Test
    public void TestEmailFirstNameIsLowerCaseThenfalse()
    {
        UserRegistration checkname= new UserRegistration();
        boolean Result = checkname.emailValid("Abc.xyz@bridgelabz.com.in");
        Assertions.assertEquals(false, Result);
    }
    @Test
    public void TestEmailLastShouldBe_Com_And_In_ThenTrue()
    {
        UserRegistration checkname= new UserRegistration();
        boolean Result = checkname.emailValid("abc.xyz@bridgelabz.com");
        boolean Result1 = checkname.emailValid("abc.xyz@bridgelabz.com.in");
        Assertions.assertEquals(true, Result);
        Assertions.assertEquals(true, Result1);
    }

    @Test
    public void TestEmailLastShouldBe_Com_And_In_Thenfalse() {
        UserRegistration checkname = new UserRegistration();
        boolean Result = checkname.emailValid("asbc@huj");
        Assertions.assertEquals(false, Result);

    }
    @Test
    public void TestEmailSignAtTheRateIsCompulsaryThenTrue()
    {
        UserRegistration checkname = new UserRegistration();
        boolean Result = checkname.emailValid("abc.xyz@bridgelabz.com.in");
        Assertions.assertEquals(true, Result);
    }

    @Test
    public void TestEmailSignAtTheRateIsCompulsaryThenFalse()
    {
        UserRegistration checkname = new UserRegistration();
        boolean Result = checkname.emailValid("abc.xyzgmail.com");
        Assertions.assertEquals(false, Result);

    }
}

