
package stack;

public class StackOverflowException extends RuntimeException
{
    public StackOverflowException()
    {
        System.out.println("Stack Over Flow!!!");
                
    }
    public StackOverflowException(String message)
    {
        System.out.println(message);
    }
}
