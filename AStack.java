
package teststacks;

public class AStack {

            private static final int CAPACITY = 1000 ;
            private int[] data ;
            private int top = -1 ;

      public AStack() {
            this(CAPACITY);
      }

      public AStack(int capacity) {
          data = new int[capacity];
      }

      public int size() {
          return (top + 1);
      }

      public boolean isEmpty() {
          return ( top == -1 );
      }

      public void push(int value) throws IllegalArgumentException {
          if (size() == data.length)
              throw new IllegalArgumentException("StackOverflowException");
              top++;
              data[top] = value;
      }

      public int pop() {
          int topValue = 0 ;
          if (!isEmpty()){
              topValue = data[top];
              top--;
          }
          else
              System.out.println("No Elements to Pop. Stack is empty");
              return topValue;
      }

      public  int peek() {
          int topValue = 0 ;
          if(!isEmpty()){
              topValue = data[top];
          }
          else {
              System.out.println("Cannot Peek. Stack is empty");
              topValue = -1 ;
          }
          return topValue ;
      }

     public void print(){
          for ( int i = 0; i < size(); i++)
              System.out.println(data[i] + " ");
     }

}
