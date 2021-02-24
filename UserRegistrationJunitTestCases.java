import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationJunitTestCases
{
    @Test
    public void TestFirstNameValidThenHAPPY()
    {
        RegistrationMethods checkObj = new RegistrationMethods();
        String Result = checkObj.checkFirstName("Sanket");
        Assert.assertEquals("HAPPY", Result);
    }
    @Test
    public void TestFirstNameValidThenSAD()
    {
        RegistrationMethods checkObj = new RegistrationMethods();
        String Result = checkObj.checkFirstName("sanket");
        Assert.assertEquals("SAD", Result);
    }
    @Test
    public void TestLastNameValidThenHAPPY()
    {
        RegistrationMethods checkObj= new RegistrationMethods();
        String Result = checkObj.checkLastName("More");
        Assert.assertEquals("HAPPY", Result);
    }
    @Test
    public void TestLastNameValidThenSAD()
    {
        RegistrationMethods checkObj = new RegistrationMethods();
        String Result = checkObj.checkLastName("sanket");
        Assert.assertEquals("SAD", Result);
    }

    @Test
    public void TestEmailNameValidThenHAPPY()
    {
        RegistrationMethods checkObj = new RegistrationMethods();
        String Result = checkObj.checkEmail("abc.xyz@bridgelabz.com.in");
        Assert.assertEquals("HAPPY", Result);
    }
    @Test
    public void TestEmailNameValidThenSAD()
    {
        RegistrationMethods checkObj = new RegistrationMethods();
        String Result = checkObj.checkEmail("abc.xyzbridgelabz.c");
        Assert.assertEquals("SAD", Result);
    }

    @Test
    public void TestMobileValidThenHAPPY()
    {
        RegistrationMethods checkObj= new RegistrationMethods();
        String Result = checkObj.checkMobile("91 1234567890");
        Assert.assertEquals("HAPPY", Result);
    }
    @Test
    public void TestMobileValidThenSAD()
    {
        RegistrationMethods checkObj= new RegistrationMethods();
        String Result = checkObj.checkMobile("9 1234567890");
        Assert.assertEquals("SAD", Result);
    }
    @Test
    public void TestPasswordValidThenHAPPY()
    {
        RegistrationMethods checkObj= new RegistrationMethods();
        String Result = checkObj.checkPasswordRule("Sanket@123");
        Assert.assertEquals("HAPPY", Result);
    }
    @Test
    public void TestPasswordValidThenSAD()
    {
        RegistrationMethods checkObj= new RegistrationMethods();
        String Result = checkObj.checkPasswordRule("sanket@123");
        Assert.assertEquals("SAD", Result);
    }
}
