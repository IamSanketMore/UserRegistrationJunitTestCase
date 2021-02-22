import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RegistrationTest
{
    @Test
    public void TestMobileNumberHaveCountryCodeThenTrue()
    {
        UserRegistration checkname= new UserRegistration();
        boolean Result = checkname.mobileNoValid("91 8180019348");
        Assertions.assertEquals(true, Result);
    }
    @Test
    public void TestMobileNumberHaveCountryCodeThenfalse()
    {
        UserRegistration checkname= new UserRegistration();
        boolean Result = checkname.mobileNoValid("8180019348");
        Assertions.assertEquals(false, Result);
    }
    @Test
    public void TestMobileNumberIsCorrectTenDigitThenTrue()
    {
        UserRegistration checkname= new UserRegistration();
        boolean Result = checkname.mobileNoValid("91 8180019348");
        Assertions.assertEquals(true, Result);
    }

    @Test
    public void TestMobileNumberIsCorrectTenDigitThenfalse()
    {
        UserRegistration checkname = new UserRegistration();
        boolean Result = checkname.mobileNoValid("91 8180019");
        Assertions.assertEquals(false, Result);

    }
}

