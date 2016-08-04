// dashed arrow meaning this is using this

// not dotted: extending 
package stack;

public class StackUnderflowException extends RuntimeException
{
    public StackUnderflowException()
    {
        System.out.println("Stack Under Flow!!!");
                
    }
    public StackUnderflowException(String message)
    {
        System.out.println(message);
    }
}
