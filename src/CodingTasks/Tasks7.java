package CodingTasks;

public class Tasks7 {
    public static void main(String[] args) {
        int n=10;
        int first=0;
        int second=1;
        System.out.println("First "+n+" numbers of the Fibonacci series:");
        if(n<1);
        System.out.println(first+ " ");
        for(int i=1; i<n;i++){
            System.out.println(second+ " ");
            int next= first + second;
            first=second;
            second=next;

        }

    }
}
