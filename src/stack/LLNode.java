
package stack;

public class LLNode<T> implements LLNodeInterface <T>
{
    // data memebers 
    private T  element;
    private LLNode nextNode;
   
    
    // constructors 
    public LLNode(T element)
    {
        this.element = element;
        nextNode = null;
    }
    
    // methods
    public void setElement(T newElement) 
    {
        element = newElement;
    }
    
    public T getElement()
    {
        return element;
    }
    public void setNextNode(LLNode nextNode)
    {
        this.nextNode = nextNode;
    }
    public LLNode getNextNode()
    {
        return nextNode;
    }
}
