package CodingTasks;

public class Tasks1 {
    public static void main(String[] args) {
        double [] temperatures= {24.0, 34.6, 21.5, 30.7, 45.6, 30.6, 26.6};
            double max= temperatures[0];
            double min= temperatures[0];
            for(double temp:temperatures){
                if(temp>max){
                    max=temp;
                }
                if(temp<min){
                    min=temp;
                }
                System.out.println("maximum temperature "+max);
                System.out.println("minimum temperature "+min);


        }
    }

}
