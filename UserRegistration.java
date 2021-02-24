import java.util.*;

public class UserRegistration
{

    public static void main(String args [])
    {
        Scanner scanReader = new Scanner(System.in);

        RegistrationMethods  checkObj = new RegistrationMethods ();

        //----------Enter First Name-------------------//
        System.out.println("Enter First Name:-");
        String FirstName = scanReader.nextLine();
        checkObj.checkFirstName(FirstName);

        //----------Enter Last Name--------------------//
        System.out.println("Enter Last Name:-");
        String LastName = scanReader.nextLine();
        checkObj.checkLastName(LastName);

        //----------Enter Email------------------------//
        System.out.println("Enter Email:-");
        String email = scanReader.nextLine();
        checkObj.checkEmail(email);

        //----------Enter Mobile NUmber----------------//
        System.out.println("Enter Mobile Number:-");
        String mobileNumber = scanReader.nextLine();
        checkObj.checkMobile(mobileNumber);

        //----------Enter Password--------------------//
        System.out.println("Enter Password :-");
        String passWord = scanReader.nextLine();
        checkObj.checkPasswordRule(passWord);

        System.out.println("Check Following Email Samples is valid or Invalid");
        checkObj.checkEmailSamples("abc@yahoo.com");
        checkObj.checkEmailSamples("abc-100@yahoo.com");
        checkObj.checkEmailSamples("abc.100@yahoo.com");
        checkObj.checkEmailSamples("abc111@abc.com");
        checkObj.checkEmailSamples("abc-100@abc.net");
        checkObj.checkEmailSamples("abc.100@abc.com.au");
        checkObj.checkEmailSamples("abc@1.com");
        checkObj.checkEmailSamples("abc@gmail.com.com");
        checkObj.checkEmailSamples("abc+100@gamil.com");

        //----------Scanner Close---------------------//
        scanReader.close();
    }
}
