import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration
{
    public boolean lastNameValid(String name)
    {
        String regx = "^[A-Z]{1}[a-zA-Z]{3,}";
        Pattern pattern = Pattern.compile(regx);
        Matcher matcher = pattern.matcher(name);
        if (matcher.matches())
        {
            System.out.println("Last Name Is Valid");
            return true;
        }
        else
        {
            System.out.println("Last Name Is In-Valid");
            return false;
        }
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        UserRegistration check = new UserRegistration();

        while (true)
        {
            System.out.println("Enter Your Last Name: ");
            String lastName = scan.nextLine();
            check.lastNameValid(lastName);
        }
    }
}