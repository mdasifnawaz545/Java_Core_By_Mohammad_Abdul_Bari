class StackUnderflowException extends Exception {
    public String toString() {
        return "Stack is Empty";
    }
}

class StackOverflowException extends Exception {
    public String toString() {
        return "Stack is Full";
    }
}

class StackOperation {
    static int stack[] = new int[5];
    static int top = -1;

    void push(int n) {
        try {
            if (top == 4)
                throw new StackOverflowException();
        } catch (StackOverflowException e) {
            System.out.println(e);
        }
        stack[++top] = n;

    }

   void pop() {
        try {
            if (top == -1)
                throw new StackUnderflowException();
        } catch (StackUnderflowException e) {
            System.out.println(e);
        }
        top--;
    }

    void display(){
        System.out.print("Stack Element : ");
        for (int i : stack) {
            System.out.print(i+" ");
        }
    }

}

public class Stack {
    
    public static void main(String args[])
    {
        StackOperation s=new StackOperation();
        s.push(786);
        s.push(786);
        s.push(786);
        s.push(786);
        s.push(786);
        s.push(786);
        // s.pop();
        s.display();
    }

}
