import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegistrationMethods
{
    public boolean checkFirstName(String firstName)
    {
        //------------Regex------------------
        String regex = "[A-Z]{1}[a-z]{2,}";

        Pattern patternChecker = Pattern.compile(regex);
        Matcher matchChecker = patternChecker.matcher(firstName);

        //-------------Check valid or Not-----
        if(matchChecker.matches()) {
            System.out.println("Valid First Name");
            return true;
        }
        else
        {
            System.out.println("InValid First Name");
            return false;
        }
    }

    public boolean checkLastName(String lastName) {
        //------------Regex------------------
        String regex = "[A-Z]{1}[a-z]{2,}";

        Pattern patternChecker = Pattern.compile(regex);
        Matcher matchChecker = patternChecker.matcher(lastName);

        //-------------Check valid or Not-----
        if (matchChecker.matches())
        {
            System.out.println("Valid Last Name");
            return true;
        }
        else
        {
            System.out.println("InValid Last Name");
            return false;
        }
    }

    public boolean checkEmail(String emailId)
    {
        //------------Regex------------------
        String regex = "^[a-z0-9]{3,}+([_+-.][a-z0-9]+)?(@[a-z0-9]+)([.][a-z]{2,4})([.][a-z]{2})?$";
        Pattern patternChecker = Pattern.compile(regex);
        Matcher matchChecker = patternChecker.matcher(emailId);

        //-------------Check valid or Not-----
        if(matchChecker.matches())
        {
            System.out.println("Valid Email");
            return true;
        }
        else
        {
            System.out.println("InValid Email");
            return false;
        }
    }

    public boolean checkMobile(String mobileNumber)
    {
        //------------Regex------------------
        String regex = "^[0-9]{2}[ ][0-9]{10}$";
        Pattern patternChecker = Pattern.compile(regex);
        Matcher matchChecker = patternChecker.matcher(mobileNumber);

        //-------------Check valid or Not-----
        if(matchChecker.matches()) {
            System.out.println("Valid Mobile Number");
            return true;
        }
        else {
            System.out.println("InValid Mobile Number");
            return false;
        }
    }

    public boolean checkPasswordRule(String passWord) {
        //------------Regex------------------
        String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[*.!@#$%^&(){}:;<>?/~_+-=|\\]]).{8,}$";
        Pattern patternChecker = Pattern.compile(regex);
        Matcher matchChecker = patternChecker.matcher(passWord);

        //-------------Check valid or Not-----
        if (matchChecker.matches()) {
            System.out.println("Valid Password");
            return true;
        }
        else {
            System.out.println("InValid Password");
            return false;
        }
    }

    public boolean checkEmailSamples(String email)
    {
        String regex = "^abc[a-zA-Z0-9.+-]*@[a-z0-9]*[.][a-z]{2,5}[.,a-z]*$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches())
        {
            System.out.println("Entered Email Sample is Valid");
            return true;
        } else
        {
            System.out.println("Entered Email Sample is Invalid");
            return false;
        }
    }
}
