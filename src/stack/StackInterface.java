package stack;
public interface StackInterface <T> // any letter can go inside the <> as long as its capital
{
    void pop() throws StackUnderflowException; // if you try to remove something from the top, and the stack is empty.... 
    T peek() throws StackUnderflowException;
    boolean isEmpty();
}
