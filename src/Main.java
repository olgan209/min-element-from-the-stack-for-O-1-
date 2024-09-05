public class Main {
    public static void main(String[] args) {
        minStack stack = new minStack();

        stack.push(34);
        stack.push(3);
        stack.push(31);
        stack.push(98);
        stack.push(92);
        stack.push(23);

        System.out.println("Минимальный элемент: " + stack.getMin());
    }
}
//Реализуйте стек, который поддерживает операцию min,
// возвращающую минимальный элемент в стеке за O(1).