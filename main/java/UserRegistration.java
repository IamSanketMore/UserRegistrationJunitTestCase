import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration
{
    public boolean emailValid(String name)
    {
        String regx = "^[a-z0-9]{3,}+([_+-.][a-z0-9]+)?(@[a-z0-9]+)([.][a-z]{2,4})([.][a-z]{2,3})?$";
        Pattern pattern = Pattern.compile(regx);
        Matcher matcher = pattern.matcher(name);
        if (matcher.matches())
        {
            System.out.println("Email Is Valid");
            return true;
        }
        else
        {
            System.out.println("Email Is In-Valid");
            return false;
        }
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        UserRegistration check = new UserRegistration();

        while (true)
        {
            System.out.println("Enter Your Email: ");
            String emailID= scan.nextLine();
            check.emailValid(emailID);
        }

    }
}