import java.util.*;

public class Binary_Search {

    public static int BinarySearch(int[] number , int key){
        int start = 0 , end = number.length - 1 ;
        while (start <= end) {
            int mid = (start + end) / 2 ;
            if (number[mid] == key ) {
                return mid ;
            }
            if (number[mid] < key) {
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }

        }
        return - 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] number = {10,20,30,40,50,60,70};
        System.out.print(" Enter Key : " );
        int key = sc.nextInt();
        System.out.println();

        System.out.println("Index of Key is :  " + BinarySearch(number, key));
    }
}
