import java.util.Stack;

public class minStack {
    private Stack<Integer> mainStack;
    private Stack<Integer> minStack;

    public minStack() {
        mainStack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        mainStack.push(x);

        if(minStack.isEmpty() || x < minStack.peek()) {
            minStack.push(x);
        }
    }
    public void pop() {
        if(mainStack.isEmpty()) {
            System.out.println("Стек пуст");
        }
        int popped = mainStack.pop();
        if(popped == minStack.peek()) {
            minStack.pop();
        }
    }
    public int top() {
        if (!mainStack.isEmpty()) {
            return mainStack.peek();
        }
        throw new RuntimeException("Стек пуст");
    }
    public int getMin(){
        if(!minStack.isEmpty()){
            return minStack.peek();
        }
        throw new RuntimeException("Стек пуст");
    }
}
