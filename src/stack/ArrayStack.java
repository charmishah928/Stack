// uses methods from bounded stack interface and stack interface
package stack;

public class ArrayStack<T> implements BoundedStackInterface <T>
{
    //data members
     protected T[] stack; //the stack itself is an array  
     //what kind of a data type is the variable stack? : right now it is just a reference
     protected int topIndex; //keep track of the top index
     
    //constructors
    public ArrayStack()
    {
        stack = (T[]) new Object[DEFCAP];
        // final goal is to have an array of T type
        //we create an object in object type and cast it to the T array
        topIndex = -1; 
    }
    public ArrayStack(int capacity)
    {
        stack = (T[]) new Object[capacity]; //create Object and cast it with T array
        topIndex = -1;
    }
    //methods
    //Methods from StackInterface
    public void pop() throws StackUnderflowException //pop removes the top element but does not return the value of it
    {
        if(!isEmpty())
        {
            //pop the item
            stack[topIndex] = null;
            topIndex--;
        }
        else
        {
            throw new StackUnderflowException();
        }
    }
    public T peek() throws StackUnderflowException
    //it will only return the top element value however, will not alter it
    {
        if(!isEmpty())
        {
            return stack[topIndex];
        }
        else
        {
            throw new StackUnderflowException();
        }
    }
    public boolean isEmpty()
    {
        return topIndex == -1;
    }
    
    //Methods from boundedStackInterface
    public void push(T element) throws StackOverflowException
    {
        if(!isFull())
        {
            stack[topIndex++] = element;
            topIndex++;
        }
        else
        {
            throw new StackOverflowException();
        }
    }
    public boolean isFull()
    {
       
        /**if(topIndex == stack.length-1)
            return true;
        else
            return false;
            **/
        return topIndex == (stack.length-1);
    }


}