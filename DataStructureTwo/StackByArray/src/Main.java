public class Main {
    public static void main(String[] args) {
        Stack newStack = new Stack(4);
        newStack.push(1);
        newStack.push(2);
        newStack.push(3);
        newStack.push(4);
        int result = newStack.peek();
        System.out.println(result);
        int result1 = newStack.peek();
        System.out.println(result1);
        // boolean result = newStack.isEmpty();
        // boolean result = newStack.isFull();
        //System.out.println(result );

    }
}
