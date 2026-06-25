public class SubArray {
    public static void PrintSubArray(int[] number){
        int TotalSubArray = 0;
        for(int i = 0 ; i<number.length ; i++){
            int start = i ;
            for(int j = i ; j<number.length ; j++){
                int end = j ;
                for(int k = start ; k<=end ; k++){
                    System.out.print( number[k]+" ");
                }
                TotalSubArray++;
                System.out.println();
            }
            System.out.println();

        }
        System.out.println("Total subarray :" + TotalSubArray);


    }
    public static void main(String[] args) {
        int[] number = {2,4,6,8,10} ;
        PrintSubArray(number);
        
    }
}
