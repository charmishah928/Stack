
package stack;

public class LLStack <T> implements UnboundedStackInterface <T>
{
   // data memebers
    private LLNode top;
    private LLNode first;
    // constructors
    public LLStack()
    {
        top = null;
    }
            
    //methods
    //from stack interface
    public void pop() throws StackUnderflowException 
    {
        LLNode shuttle = first;
        if(!isEmpty())
        {
            while(shuttle != top)
            {
                shuttle = shuttle.getNextNode();
            }
            shuttle.setNextNode(null);
            top = shuttle;
        }
        else
        {
            throw new StackUnderflowException();
        }
    }
   public  T peek() throws StackUnderflowException
   {
       if(top != null)
       {
           return (T) top.getElement();
       }
       else
       {
           throw new StackUnderflowException();
       }
   }
   public  boolean isEmpty() 
   {
     return top == null;  
   }
    //from unboundedstackinterface
    public void push(T element)
    {
        LLNode temp = new LLNode(element);
        if(first == null && top == null)
        {
            first = temp;
            top = temp;
        }
        else 
        {
            top.setNextNode(temp);
            top = temp;
        }     
    }

}
