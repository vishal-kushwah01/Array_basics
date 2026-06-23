import java.util.*;

public class ArrayAsFunction {
    public static void Update(int marks[]){
        //loop for updating marks
       for(int i = 0 ; i<marks.length ; i++){
        marks[i] = marks[i] + 1;
       }
    }
    public static void main(String[] args) {
        int marks[] = {98 , 97 , 96};

        Update(marks);

        //loop for print marks
        for(int i = 0 ; i<marks.length ; i++){
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }
}
