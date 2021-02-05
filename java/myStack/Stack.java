public class Stack {
    int top;
    int[] StackArray;

    int STACKSIZE;
    int temp;

    Stack () {
        this.top = 0;
        STACKSIZE = 10;
        StackArray = new int[STACKSIZE];
    }

    boolean isFull() {
        if (this.top == STACKSIZE)
        {
            return true;
        }
        else return false;
    }

    boolean isEmpty() {
        if (this.top == 0)
        {
            return true;
        }
        else return false;
    }

    void Push(int value) {
        if(isFull() == false) {
            StackArray[this.top++] = value;
        }
        else {
            System.out.println("스택이 가득 찼습니다.");
            return;
        }
    }

    int Pop() {
        if(isEmpty() == false) {
            this.temp = StackArray[--this.top];
            this.StackArray[this.top] = 0;
            return temp;
        }
        else {
            System.out.println("\n스택이 비었습니다.");
            return -1;
        }
    }
}
