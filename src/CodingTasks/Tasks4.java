package CodingTasks;

public class Tasks4 {
    public static void main(String[] args) {
        int [][] numbers= {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        int evenSum=0;
        int oddSum=0;
        for(int [] num:numbers) {
            for (int i : num) {
                if (i % 2 == 0) {
                    evenSum = evenSum + i;
                }else {
                    oddSum = oddSum +i;
                }
                System.out.println(evenSum);
                System.out.println(oddSum);
            }
        }
    }
}
