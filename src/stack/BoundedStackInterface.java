
package stack;

public interface BoundedStackInterface <T> extends StackInterface <T> //since we are using generic data types, interfaces also need the "T" 
{
    int DEFCAP = 5; //default capacity bc we are using a bounded stack // limit // default boundry // capital bc its constant 
    void push(T element) throws StackOverflowException; //exception bc if you try to push something if it is already full
    boolean isFull(); // return true/false 
}
