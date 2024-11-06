package CodingTasks;

public class Tasks5 {
    public static void main(String[] args) {
        int a=10;
        int b=5;
        //Swap two numbers without a temporary variable
        a=a+b;
        a=a-b;
        b=a-b;
        System.out.println(b);
        System.out.println(a);
        System.out.println("Number after swapping is: " + a);
        System.out.println("Number after swapping is: " + b);


    }
}
