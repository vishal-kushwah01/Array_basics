public class maxsubarray {
    public static void Max(int[] number){
        int maxsum = Integer.MIN_VALUE; //-infinity
        for(int i = 0 ; i<number.length ;i++){
            for(int j = i ; j<number.length;j++){
                int currsum = 0;
                for(int k = i ; k<=j ; k++){
                    System.out.print(   number[k] + " ");
                    currsum = currsum + number[k];
                }
                System.out.println(" : " + currsum);
                System.out.println();
                if (currsum > maxsum) {
                    maxsum = currsum;
                }
            }
            
                
            }
            System.out.println();
            System.out.println("maximum value of subarray is : " + maxsum);
        }
       
    public static void main(String[] args) {
        int[] number = {2,4,6,8,10};
        Max(number);
    }
}
