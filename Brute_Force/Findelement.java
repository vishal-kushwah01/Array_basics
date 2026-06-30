import java.util.*;
public class Findelement{
    public static int Find(int[] number , int target){
        for(int i = 0 ; i<number.length ; i++){
            if (number[i] == target) {
               return i;
            }
            
        }
        return -1;
       
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] number = {2,3,4,5,6,7,8};
        System.out.print("Enter target value : ");
        int target = sc.nextInt();
        int index = target;
        System.out.println("Index of target value is  : " + Find(number , index));
        
    }
}