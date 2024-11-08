public class stack {
    int top;
    int size;
    int[] stack;

    //constructor
    stack(){
        top=-1;
        size=10;
        stack=new int[size];
    }
    public boolean isEmpty(){
        return top==-1;
    }
    public boolean isFull(){
        return top==size-1;
    }

    public int push(int data){
        if(isFull()){
            System.out.println("Stack is full");
        }
        return stack[++top]=data;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("stack is empty");
        }
        return stack[top--];
    }

    public int peek(){
        return stack[top];
    }
    public static void main(String[] args) {
        stack st=new stack();
        st.push(34);
        st.push(20);
        st.push(50);
        st.push(80);
        st.push(40);
        //System.out.println(st.isEmpty());
        //System.out.println(st.isFull());
        //System.out.println(st.size);
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.peek());

    }
}
