import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationJunitTestCases
{
    @Test
    public void TestFirstNameValidThenTrue()
    {
        RegistrationMethods checkObj = new RegistrationMethods();
        boolean Result = checkObj.checkFirstName("Sanket");
        Assert.assertEquals(true, Result);
    }

    @Test
    public void TestLastNameValidThenTrue()
    {
        RegistrationMethods checkObj= new RegistrationMethods();
        boolean Result = checkObj.checkLastName("More");
        Assert.assertEquals(true, Result);
    }

    @Test
    public void TestEmailNameValidThenTrue()
    {
        RegistrationMethods checkObj = new RegistrationMethods();
        boolean Result = checkObj.checkEmail("abc.xyz@bridgelabz.com.in");
        Assert.assertEquals(true, Result);
    }

    @Test
    public void TestMobileValidThenTrue()
    {
        RegistrationMethods checkObj= new RegistrationMethods();
        boolean Result = checkObj.checkMobile("91 1234567890");
        Assert.assertEquals(true, Result);
    }

    @Test
    public void TestPasswordValidThenTrue()
    {
        RegistrationMethods checkObj= new RegistrationMethods();
        boolean Result = checkObj.checkPasswordRule("Sanket@123");
        Assert.assertEquals(true, Result);
    }


}
