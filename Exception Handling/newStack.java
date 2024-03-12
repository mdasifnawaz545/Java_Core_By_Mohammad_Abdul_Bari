class StackErrorpush extends Exception {
    public String toString() {
        return "Stack is full";
    }
}

class StackErrorpop extends Exception {
    public String toString() {
        return "Stack is Empty";
    }
}

class stack {
    int top = -1;
    int array[] = new int[5];

    void push(int i) {
        try {
            if (top == array.length) {
                throw new StackErrorpush();
            }
        } catch (StackErrorpush s) {
            System.out.println(s);
        }
        array[++top] = i;
    }

    void pop() {
        top--;
    }

    void show() {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}

class newStack {
    public static void main(String args[]) {
        stack s = new stack();
        s.push(786);
        s.push(786);
        s.push(786);
        s.push(786);
        s.push(786);
        s.push(1);
        s.show();

    }
}