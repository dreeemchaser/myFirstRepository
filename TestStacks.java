
package teststacks;


public class TestStacks {
    public static void main(String[] args) {
        
    AStack aStack = new AStack();

    aStack.push(5);
    aStack.push(2);
    aStack.push(7);
    aStack.print();
        System.out.println("Stack Size: " +  aStack.size());
        System.out.println("Stack Popped: " +  aStack.pop());
    aStack.print();
        System.out.println(aStack.isEmpty());

    }
}
 