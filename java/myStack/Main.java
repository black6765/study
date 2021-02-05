public class Main
{
    public static void main(String [] args)
    {
        Stack a = new Stack();

        // Push 반복 3번
        a.Push(1);
        System.out.println("");
        for(int i : a.StackArray)
            System.out.print(i + " ");

        a.Push(2);
        System.out.println("");
        for(int i : a.StackArray)
            System.out.print(i + " ");

        a.Push(3);
        System.out.println("");
        for(int i : a.StackArray)
            System.out.print(i + " ");

        // Pop 연속 4번 : 스택이 비었다는 메시지가 출력되어야 함
        System.out.println("\n===========================");
        System.out.println("\nPop : " + a.Pop());
        for(int i : a.StackArray)
            System.out.print(i + " ");

        System.out.println("\n===========================");
        System.out.println("\nPop : " + a.Pop());
        for(int i : a.StackArray)
            System.out.print(i + " ");

        System.out.println("\n===========================");
        System.out.println("\nPop : " + a.Pop());
        for(int i : a.StackArray)
            System.out.print(i + " ");

        // 마지막 Pop에서는 비어있는 값을 Pop 했으므로 -1이 반환
        System.out.println("\n===========================");
        System.out.println("\nPop : " + a.Pop());
        for(int i : a.StackArray)
            System.out.print(i + " ");
    }
}
