public class SubArray {
    public static void PrintSubArray(int[] number){
        int TotalSubArray = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
      
        for(int i = 0 ; i<number.length ; i++){
            int start = i ;
            for(int j = i ; j<number.length ; j++){
                int end = j ;

                int currsum = 0;
                for(int k = start ; k<=end ; k++){
                    System.out.print( number[k]+" ");
                    currsum = currsum + number[k];   
                } 
                System.out.print("-> " + currsum);  
                if (currsum > max) {
                    max = currsum;
                }  
                if (currsum < min) {
                    min = currsum;
                }     
                TotalSubArray++;
                System.out.println();
                
               
            }
            System.out.println();

        }
    
        System.out.println("Total subarray :" + TotalSubArray);
        System.out.println("Minimum Subarray : " + min);
        System.out.println("Maximum Subaaray : " + max);
      


    }
    public static void main(String[] args) {
        int[] number = {2,4,6,8,10} ;
        PrintSubArray(number);
        
    }
}
