import java.util.*;

public class Linear_Search {
    public static int LinearSearch(int number[] , int key){
        for(int i = 0 ; i<number.length ; i++){
            if (number[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number[] = {2,4,6,8,10,12,14,16};
        System.out.print("Enter key : ");
        int key = sc.nextInt();

        int index = LinearSearch(number, key);
        if (index == -1) {
            System.out.println("Key Not Found");
        }
        else{
            System.out.println("Key is at Index : " + index);
        }
    }
}
