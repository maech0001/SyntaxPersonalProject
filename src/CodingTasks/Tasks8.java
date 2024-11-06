package CodingTasks;

public class Tasks8 {
    public static void main(String[] args) {
        int[] numbers={7,6,3,8,9,1,5};
       int firstLargestNumber=numbers[0];
       int secondLargestNumber=numbers[0];
       for(int i=0; i<numbers.length;i++){
           if (numbers[i] > firstLargestNumber) {
               firstLargestNumber=numbers[i];
           }
           if(numbers[i] >secondLargestNumber && numbers[i] !=9){
               secondLargestNumber=numbers[i];
           }
       }
        System.out.println("First Largest Number is: "+firstLargestNumber);
        System.out.println("Second Largest Number is: "+secondLargestNumber);
    }
}
