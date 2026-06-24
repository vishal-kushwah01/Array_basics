import java.util.*;

public class Input_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] number = new int[5];

        for(int i = 0 ; i<number.length ; i++){
             number[i] = sc.nextInt();
        }
        for(int i = 0 ; i<number.length ; i++){
            System.out.print(number[i] + " ");
        }
    }
}
