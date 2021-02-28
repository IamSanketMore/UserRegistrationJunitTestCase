//-------------------------Custom Exception UserRegistrationException created ------------------ //
public class UserRegistrationException extends Exception
{
    enum ExceptionType
    {
        NullEnter,EmptyEnter
    }
    ExceptionType type;

    public UserRegistrationException(String message,ExceptionType type)
    {
        super(message);
        this.type= type;
    }
}