import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration
{
    public boolean checkPasswordRule(String passWord)
    {
        String regx = "^[a-zA-z]{8,}";
        Pattern pattern = Pattern.compile(regx);
        Matcher matcher = pattern.matcher(passWord);
        if (matcher.matches())
        {
            System.out.println("Mobile Number Is Valid");
            return true;
        }
        else
        {
            System.out.println("Mobile Number Is In-Valid");
            return false;
        }
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        UserRegistration check = new UserRegistration();

       while (true)
       {
            System.out.println("Enter Your Mobile Number:- ");
            String mobileNumber= scan.nextLine();
            check.checkPasswordRule(mobileNumber);
       }

    }
}