class Stack {
    int stack[] = new int[10];
    int top_of_stack;

    Stack() {
        top_of_stack = -1;
    }

    void push(int data) {
        if(top_of_stack == 9) {
            System.out.println("Stack is full. ");
        } else {
            stack[++top_of_stack] = data;
        }
    }

    int pop() {
        if(top_of_stack < 0) {
            System.out.println("Stack Underflow.");
            return 0;
        } else {
            return stack[top_of_stack--];
        }
    }
}



public class TestStack {
    public static void main(String args[]){
        Stack mystack1 = new Stack();
        Stack mystack2 = new Stack();

        for(int i = 0; i<10; i++) mystack1.push(i);
        for(int i = 10; i<20; i++) mystack2.push(i);

        System.out.println("Stack in mystack: ");
        for(int i=0; i<10; i++)
            System.out.println(mystack1.pop());

        System.out.println("Stack in mystack2: ");
        for(int i=0; i<10; i++)
            System.out.println(mystack2.pop());
    }
}