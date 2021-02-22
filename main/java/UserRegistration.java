import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration
{
    public boolean checkPasswordRule(String passWord)
    {
        String regx = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[*.!@#$%^&(){}:;<>?/~_+-=|\\]]).{8,}$";
        Pattern pattern = Pattern.compile(regx);
        Matcher matcher = pattern.matcher(passWord);
        if (matcher.matches())
        {
            System.out.println("Password Is Valid");
            return true;
        }
        else
        {
            System.out.println("Password Is In-Valid");
            return false;
        }
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        UserRegistration check = new UserRegistration();

       while (true)
       {
            System.out.println("Enter Your Password:- ");
            String passWord= scan.nextLine();
            check.checkPasswordRule(passWord);
       }

    }
}