import java.lang.reflect.Array;

public class SumOfArray {
    public static int Sum(int[] number){
        int sum = 0;
        for(int i = 0 ; i<number.length ; i++){
            sum = sum + number[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] number = {10,20,30,40,50};
        System.out.println("Sum of Array element is : " + Sum(number));

    }
}
