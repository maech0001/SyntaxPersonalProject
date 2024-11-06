package CodingTasks;

public class Tasks9 {
    public static void main(String[] args) {
        String[] elements ={"Pencil", "Bucket", "Book", "Phone", "Pan", "Pencil"};
        System.out.println("Duplicate elements");
        for(int i=0; i<elements.length;i++){
            for(int j=0; j<elements.length;j++){
                if(elements[i].equals(elements[j])){
                    System.out.println(elements[i]);
                    break;
                }
            }
        }
    }

}
