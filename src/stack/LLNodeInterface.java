package stack;

public interface LLNodeInterface <T> 
{
    void setElement(T element);
    T getElement();
    void setNextNode(LLNode nextNode);
    LLNode getNextNode();
}
