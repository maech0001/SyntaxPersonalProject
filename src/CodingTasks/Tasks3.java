package CodingTasks;

public class Tasks3 {
    public static void main(String[] args) {
        int[][] Numbers={
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15}
        };
        System.out.println("Even numbers in array:");
        for (int[] row:Numbers) {
            for (int n:row) {
                if (n%2==0) {
                    System.out.println(n);
                }
            }
        }

    }
    }

