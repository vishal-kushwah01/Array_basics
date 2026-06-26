
public class MaxSubArray {
    public static void FindMax(int[] number){
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < number.length ; i++){
            for(int j = i ; j<number.length ; j++){

                int currsum = 0;
                for(int k = i ; k<=j ; k++){
                    System.out.print(number[k] + " , ");
                    currsum = currsum + number[k];
                }
                if (currsum > max) {
                    max = currsum;
                }
                System.out.print(" -> " + currsum);
                System.out.println();

               
            }
            System.out.println();
        }
        System.out.println("Maximum value of Subarray :" + max);
       
    }
    public static void main(String[] args) {
        int[] number = {1,-2,6,-1,3};
        FindMax(number);
    }
}
