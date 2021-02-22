import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration
{
    public boolean mobileNoValid(String name)
    {
        String regx = "^[0-9]{2}+[:space:]+[0-9]{10}+$";
        Pattern pattern = Pattern.compile(regx);
        Matcher matcher = pattern.matcher(name);
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
            check.mobileNoValid(mobileNumber);
       }

    }
}