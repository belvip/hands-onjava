public class Stack {
    int[] arr;
    int topOfStack;

    public Stack(int size){
        this.arr = new int[size];
        this.topOfStack = -1;
        System.out.println("The Stack is created with size : " + size);
    }

    // isEmpty
    public boolean isEmpty(){
        if(topOfStack == -1){
            return true;
        }else {
            return false;
        }
    }

    // isFull
    public boolean isFull(){
        if(topOfStack == arr.length-1){
            return true;
        }else {
            return false;
        }
    }

    
}
