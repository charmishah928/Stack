//unbounded meaning it does not have a limit 
//will not have a overflow exception but will have a underflow
// no need to throw the exception again bc we are extending StackInterface
package stack;


public interface UnboundedStackInterface<T> extends StackInterface<T> 
{
    void push(T element);
}
