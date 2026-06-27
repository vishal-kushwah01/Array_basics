public class Kadane_s {

    public static void Kadanes(int number[]){
        int max = Integer.MIN_VALUE;
        int curr = 0;
        for(int i = 0 ; i<number.length ; i++){
            curr = curr + number[i];
            if (curr < 0) {
                curr = 0;
            }
            max = Math.max(curr , max);
        }
        System.out.println("Maximum subarray sum is : "+max);
    }
    public static void main(String[] args) {
        int number[] ={-2,-3,4,-1,-2,1,5,-3};
        Kadanes(number);
    }
}
