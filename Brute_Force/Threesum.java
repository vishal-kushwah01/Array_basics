import java.util.*;
public class Threesum {
    public static void Find(int[] number , int target){
        for(int i = 0 ; i<number.length ; i++){
            for(int j = i+1 ; j<number.length ; j++){
                for(int k = j+1 ; k<number.length ; k++){
                    if(number[i] + number[j] + number[k] == target){
                        System.out.println("Found " + number[i] + "," + number[j] + "," + number[k] + " = " + target);
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] number = {2,3,4,5,6,10,12,14,17,18};
        System.out.print("Enter the target value : ");
        int target = sc.nextInt();
        Find(number , target);

    }
}
