import java.util.*;
public class Twosum{
    public static void Find(int[] number , int target){
        for(int i = 0 ; i<number.length ; i++){
            for(int j = i+1 ; j<number.length ;j++){
                if (number[i] + number[j] == target) {
                  System.out.println("Found " + number[i] + "," + number[j] + " = " + target);

                }
                
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] number = {2,3,4,5,6,10};
        System.out.print("Enter the target value: ");
        int target = sc.nextInt();
        Find(number , target);



    }
}